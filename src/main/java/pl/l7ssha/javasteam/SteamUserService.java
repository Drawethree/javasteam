package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.NamedSteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;

public class SteamUserService implements ISteamService{
    /**
     * Returns user with specified steamid.
     * @param steamid ID of user in 32-bit interger format
     * @return ISteamUser
     */
    public ISteamUser getSteamUser(Long steamid) {
        return new SteamUser(steamid);
    }

    /**
     *  Returns user with specified nick. Constructor blocks thread! If you have user id, use version of method with id.
     * @param nick Nick of user
     * @return ISteamUser
     */
    public ISteamUser getSteamUser(String nick) {
        return new NamedSteamUser(nick);
    }
}
