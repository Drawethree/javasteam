package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.utils.Responser;

public class SteamAPI {
    public SteamAPI(final String key) {
        Responser.setToken(key);
    }

    public CsgoService getCsgoService() {
        return new CsgoService();
    }

    public SteamUserService getSteamUserService() {
        return new SteamUserService();
    }

    public StoreFrontService getStoreFront() {
        return new StoreFrontService();
    }
}
