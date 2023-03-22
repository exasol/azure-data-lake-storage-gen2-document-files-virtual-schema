package com.exasol.adapter.document.files;

import com.exasol.adapter.document.connection.ConnectionPropertiesReader;
import com.exasol.adapter.document.documentfetcher.files.FileFinderFactory;
import com.exasol.adapter.document.documentfetcher.files.RemoteFileFinder;
import com.exasol.adapter.document.files.connection.AdlsConnectionPropertiesReader;
import com.exasol.adapter.document.files.stringfilter.StringFilter;

/**
 * Factory for {@link AdlsRemoteFileFinder}s.
 */
public class AdlsFileFinderFactory implements FileFinderFactory {

    private static final long serialVersionUID = 1L;

    @Override
    public RemoteFileFinder getFinder(final StringFilter filePattern,
            final ConnectionPropertiesReader connectionInformation) {
        return new AdlsRemoteFileFinder(filePattern, new AdlsConnectionPropertiesReader().read(connectionInformation));
    }

    @Override
    public String getUserGuideUrl() {
        return AdlsVsConstants.USER_GUIDE_URL;
    }
}
