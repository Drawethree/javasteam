package pl.l7ssha.javasteam.csgo;

// pl.l7ssha.javasteam.csgo
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class csgoAPI {
    private final String token;

    private final String serverStatusUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/";

    public csgoAPI(String token) {
        this.token = token;
    }
}
