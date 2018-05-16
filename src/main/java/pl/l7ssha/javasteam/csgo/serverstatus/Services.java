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

    /**
     * Contains logging service status
     * @return status String
     */
    public String getSessionsLogon() {
        return SessionsLogon;
    }

    /**
     * Describes status of steam community service (probably forums)
     * @return Status String
     */
    public String getSteamCommunity() {
        return SteamCommunity;
    }

    /**
     * Not documented. To fix.
     * @return String
     */
    public String getiEconItems() {
        return IEconItems;
    }

    /**
     * Contains leaderboards service status
     * @return Status String
     */
    public String getLeaderboards() {
        return Leaderboards;
    }
}
