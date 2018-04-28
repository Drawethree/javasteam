package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam.csgo
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.csgo.mapsplaytime.Gamemode;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Interval;
import pl.l7ssha.javasteam.csgo.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.mapPlaytimeUrl;
import static pl.l7ssha.javasteam.utils.Links.serverStatusUrl;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class CsgoService implements ISteamService {
    /**
     * Fetches CSGO serves status
     * @return ServerStatus
     */
    public ServerStatus getGameServerStatus() {
        return getGenericResponse(serverStatusUrl, ServerStatus.class);
    }

    /**
     * Asynchronously fetches CSGO serves status
     * @return CompletableFuture
     */
    public CompletableFuture<ServerStatus> getGameServerStatusAsync() {
        return CompletableFuture.supplyAsync(this::getGameServerStatus);
    }

    /**
     * Gets operation-based (to fix) data about maps.
     * @param mode Mode to play
     * @param interval From how much time get data
     * @return MapPlaytime
     */
    public MapPlaytime getMapPlaytime(Gamemode mode, Interval interval) {
        return getGenericResponse(String.format(mapPlaytimeUrl, interval.toString(), mode.toString()), MapPlaytime.class);
    }

    /**
     * Gets operation-based (to fix) data about maps.
     * @param mode Mode to play
     * @param interval From how much time get data
     * @return CompletableFuture
     */
    public CompletableFuture<MapPlaytime> getMapPlaytimeAsync(Gamemode mode, Interval interval) {
        return CompletableFuture.supplyAsync(() -> getMapPlaytime(mode, interval));
    }
}
