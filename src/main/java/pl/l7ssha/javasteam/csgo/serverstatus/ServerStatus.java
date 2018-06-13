package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class ServerStatus {
    private RequestInfo app;
    private Services services;
    private Datacenters datacenters;
    private Matchmaking matchmaking;

    @SerializedName("perfectworld")
    private PerfectWorld perfectWorld;

    public ServerStatus() {}

    /**
     * Undocumented. Not sure of it's request data or last update data. [TO FIX]
     * @return Object with data about (request or latest update)
     */
    public RequestInfo getApp() {
        return app;
    }

    /**
     * Informations about status of steam services related to CSGO
     * @return Object with status of steam services
     */
    public Services getServices() {
        return services;
    }

    /**
     * Actual data with csgo server status.
     * @return List of csgo data centers with data attached to it
     */
    public Datacenters getDatacenters() {
        return datacenters;
    }

    /**
     * Informations about matchmaking service and scheduler. Also contains amount of searching players at the moment.
     * @return Object with matchmaking service status and stats
     */
    public Matchmaking getMatchmaking() {
        return matchmaking;
    }

    /**
     * Undocumented. Contains status of logon and purchase services.
     * @return Object with steam services status
     */
    public PerfectWorld getPerfectWorld() {
        return perfectWorld;
    }
}
