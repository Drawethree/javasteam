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

public class CsgoService {
    private String token = null;
    private final String serverStatusUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/?key=%s";
    private final String mapPlaytimeUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameMapsPlaytime/v1/?key=%s&format=json&interval=%s&gamemode=%s&mapgroup=operation";

    CsgoService(String token) {
        this.token = token;
    }

    private CsgoService() { }

    public ServerStatus getGameServerStatus() throws Exception {
        return (ServerStatus) Responser.getResponse(String.format(serverStatusUrl, token), ServerStatus.class);
    }

    public MapPlaytime getMapPlaytime(Gamemode mode, Interval interval) throws Exception {
        return (MapPlaytime) Responser.getResponse(String.format(mapPlaytimeUrl, token, interval.toString(), mode.toString()), MapPlaytime.class);
    }
}