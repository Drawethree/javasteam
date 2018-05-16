package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

/**
 * Weird name. Contains info about logon and purchase services
 */
public class PerfectWorld {
    private PerfWorld logon;
    private PerfWorld purchase;

    public PerfectWorld() { }

    /**
     * Logon service details
     * @return Object with logon details
     */
    public PerfWorld getLogon() {
        return logon;
    }

    /**
     * Details of marketplace service
     * @return Marketplace info as object
     */
    public PerfWorld getPurchase() {
        return purchase;
    }
}
