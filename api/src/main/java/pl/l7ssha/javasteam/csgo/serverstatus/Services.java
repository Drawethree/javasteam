package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public class Services {
    private String SessionsLogon;
    private String SteamCommunity;
    private String IEconItems;
    private String Leaderboards;

    public Services() { }

    public String getSessionsLogon() {
        return SessionsLogon;
    }

    public String getSteamCommunity() {
        return SteamCommunity;
    }

    public String getiEconItems() {
        return IEconItems;
    }

    public String getLeaderboards() {
        return Leaderboards;
    }
}
