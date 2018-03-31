package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.csgo.csgoAPI;

public class SteamAPI {
    private final String API_KEY;

    public SteamAPI(final String key) {
        API_KEY = key;
    }

    public csgoAPI getCSGO() {
        return new csgoAPI(API_KEY);
    }


}
