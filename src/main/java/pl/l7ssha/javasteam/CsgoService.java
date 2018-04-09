package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.csgo
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.csgo.mapsplaytime.Gamemode;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Interval;
import pl.l7ssha.javasteam.csgo.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.mapPlaytimeUrl;
import static pl.l7ssha.javasteam.utils.Links.serverStatusUrl;

public class CsgoService {
    CsgoService() { }

    public ServerStatus getGameServerStatus() {
        return getGenericResponse(serverStatusUrl, ServerStatus.class);
    }

    public CompletableFuture<ServerStatus> getGameServerStatusAsync() {
        return CompletableFuture.supplyAsync(this::getGameServerStatus);
    }

    public MapPlaytime getMapPlaytime(Gamemode mode, Interval interval) {
        return getGenericResponse(String.format(mapPlaytimeUrl, interval.toString(), mode.toString()), MapPlaytime.class);
    }

    public CompletableFuture<MapPlaytime> getMapPlaytimeAsync(Gamemode mode, Interval interval) {
        return CompletableFuture.supplyAsync(() -> getMapPlaytime(mode, interval));
    }
}