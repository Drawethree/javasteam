package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class ServerStatus {
    private RequestInfo app;
    private Services services;
    private Datacenters datacenters;
    private Matchmaking matchmaking;

    @SerializedName("perfectworld")
    private PerfectWorld perfectWorld;

    public ServerStatus() { }

    public RequestInfo getApp() {
        return app;
    }

    public Services getServices() {
        return services;
    }

    public Datacenters getDatacenters() {
        return datacenters;
    }

    public Matchmaking getMatchmaking() {
        return matchmaking;
    }

    public PerfectWorld getPerfectWorld() {
        return perfectWorld;
    }
}
