package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.csgo
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.csgo.models.mapsplaytime.Gamemode;
import pl.l7ssha.javasteam.csgo.models.mapsplaytime.Interval;
import pl.l7ssha.javasteam.csgo.models.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.models.serverstatus.ServerStatus;
import pl.l7ssha.javasteam.utils.Responser;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.mapPlaytimeUrl;
import static pl.l7ssha.javasteam.utils.Links.serverStatusUrl;

public class CsgoService {
    CsgoService() { }

    public ServerStatus getGameServerStatus() {
        return (ServerStatus) Responser.getResponse(serverStatusUrl, ServerStatus.class);
    }

    public CompletableFuture<ServerStatus> getGameServerStatusAsync() {
        return CompletableFuture.supplyAsync(() -> getGameServerStatus());
    }

    public MapPlaytime getMapPlaytime(Gamemode mode, Interval interval) {
        return (MapPlaytime) Responser.getResponse(String.format(mapPlaytimeUrl, interval.toString(), mode.toString()), MapPlaytime.class);
    }

    public CompletableFuture<MapPlaytime> getMapPlaytimeAsync(Gamemode mode, Interval interval) {
        return CompletableFuture.supplyAsync(() -> getMapPlaytime(mode, interval));
    }
}