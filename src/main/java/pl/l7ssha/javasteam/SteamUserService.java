package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.NamedSteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;

public class SteamUserService {
    SteamUserService() { }

    public ISteamUser getSteamUser(Long steamid) {
        return new SteamUser(steamid);
    }

    public ISteamUser getSteamUser(String nick) {
        return new NamedSteamUser(nick);
    }
}
