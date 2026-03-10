package com.exasol.adapter.document.files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.azure.core.http.rest.PagedIterable;
import com.azure.storage.file.datalake.DataLakeDirectoryClient;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.azure.storage.file.datalake.models.ListPathsOptions;
import com.azure.storage.file.datalake.models.PathItem;
import com.exasol.adapter.document.documentfetcher.files.RemoteFile;
import com.exasol.adapter.document.files.connection.AdlsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;
import com.exasol.adapter.document.iterators.CloseableIterator;

@ExtendWith(MockitoExtension.class)
class AdlsRemoteFileFinderTest {
    @Mock
    DataLakeFileSystemClient dlFileSystemClientMock;
    @Mock
    PagedIterable<PathItem> pagedIterableMock;
    @Mock
    Iterator<PathItem> iteratorMock;

    @Test
    void testInvalidAdlsCsException() {
        final var connectionInformation = AdlsConnectionProperties.builder()
                .adlsContainerName("my-bucket")
                .adlsStorageAccountKey("bleh")
                .adlsStorageAccountName("{ invalid JSON").build();
        final WildcardExpression filter = WildcardExpression.fromGlob("*");
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new AdlsRemoteFileFinder(filter, connectionInformation));
        assertThat(exception.getMessage(),
                containsString("Illegal character in authority"));
    }

    @ParameterizedTest
    @ValueSource(strings = { "", "/", "file.txt", "/file.txt", "*", "/*", "file-?", "file-?.txt", "file-*", "file-*.txt" })
    void rootPatternListsCompleteBucket(final String wildcardExpression) {
        loadFiles(wildcardExpression);
        assertFilesListed("");
    }

    @ParameterizedTest
    @CsvSource({ "subdir/*, subdir", "subdir/file-?, subdir", "subdir/file-?.txt, subdir", "subdir/file-*, subdir", "subdir/file-*.txt, subdir",
            "dir1/dir-?/*, dir1", "dir1/dir2, dir1", "dir1/dir2/, dir1/dir2", "dir1/dir2/file.txt, dir1/dir2", "dir1/dir2/*, dir1/dir2",
            "dir1/dir2/file-?, dir1/dir2", "dir1/dir2/file-*.txt, dir1/dir2", "dir1/dir2/file-*, dir1/dir2", "dir1/dir2/file-?.txt, dir1/dir2" })
    void subDirPatternListsSubdirWhenDirExists(final String wildcardExpression, final String expectedListedPath) {
        final DataLakeDirectoryClient dirClientMock = mock();
        when(dirClientMock.exists()).thenReturn(true);
        when(dlFileSystemClientMock.getDirectoryClient(expectedListedPath)).thenReturn(dirClientMock);
        loadFiles(wildcardExpression);
        assertFilesListed(expectedListedPath);
    }

    @ParameterizedTest
    @CsvSource({ "subdir/*, subdir", "subdir/file-?, subdir", "subdir/file-?.txt, subdir", "subdir/file-*, subdir", "subdir/file-*.txt, subdir",
            "dir1/dir-?/*, dir1", "dir1/dir2, dir1", "dir1/dir2/, dir1/dir2", "dir1/dir2/file.txt, dir1/dir2", "dir1/dir2/*, dir1/dir2",
            "dir1/dir2/file-?, dir1/dir2", "dir1/dir2/file-*.txt, dir1/dir2", "dir1/dir2/file-*, dir1/dir2", "dir1/dir2/file-?.txt, dir1/dir2" })
    void subDirPatternSkipsListingWhenDirDoesNotExist(final String wildcardExpression, final String expectedListedPath) {
        final DataLakeDirectoryClient dirClientMock = mock();
        when(dirClientMock.exists()).thenReturn(false);
        when(dlFileSystemClientMock.getDirectoryClient(expectedListedPath)).thenReturn(dirClientMock);
        final CloseableIterator<RemoteFile> files = loadFiles(wildcardExpression);
        assertThat(files.hasNext(), is(false));
        verify(dlFileSystemClientMock, never()).listPaths(any(), eq(null));
    }

    @Test
    void subDirPatternSkipsListingWhenDirExistsReturnsNull() {
        final DataLakeDirectoryClient dirClientMock = mock();
        when(dirClientMock.exists()).thenReturn(null);
        when(dlFileSystemClientMock.getDirectoryClient("subdir")).thenReturn(dirClientMock);
        final CloseableIterator<RemoteFile> files = loadFiles("subdir/*");
        assertThat(files.hasNext(), is(false));
        verify(dlFileSystemClientMock, never()).listPaths(any(), eq(null));
    }

    private void assertFilesListed(final String expectedPath) {
        final ArgumentCaptor<ListPathsOptions> optionsCaptor = ArgumentCaptor.forClass(ListPathsOptions.class);
        verify(dlFileSystemClientMock).listPaths(optionsCaptor.capture(), eq(null));
        assertThat(optionsCaptor.getValue().getPath(), equalTo(expectedPath));
        assertThat(optionsCaptor.getValue().isRecursive(), is(true));
    }

    private CloseableIterator<RemoteFile> loadFiles(final String pattern) {
        return testee(pattern).loadFiles();
    }

    private AdlsRemoteFileFinder testee(final String pattern) {
        lenient().when(dlFileSystemClientMock.listPaths(any(), eq(null))).thenReturn(pagedIterableMock);
        lenient().when(pagedIterableMock.iterator()).thenReturn(iteratorMock);
        return new AdlsRemoteFileFinder(WildcardExpression.fromGlob(pattern), dlFileSystemClientMock);
    }
}
