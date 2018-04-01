package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class SteamAPI {
    private final String API_KEY;

    public SteamAPI(final String key) {
        API_KEY = key;
    }

    public CsgoService getCsgoService() {
        return new CsgoService(API_KEY);
    }
}
