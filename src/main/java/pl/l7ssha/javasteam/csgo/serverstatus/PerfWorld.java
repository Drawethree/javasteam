package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public class PerfWorld {
    private String availability;
    private String latency;

    public PerfWorld() { }

    /**
     * Indicates if service is online
     * @return String with data. Possible values: online, offline
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Informs about latency in service
     * @return String
     */
    public String getLatency() {
        return latency;
    }
}
