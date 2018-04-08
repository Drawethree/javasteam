package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test.csgotest
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.CsgoService;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Gamemode;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Interval;
import pl.l7ssha.javasteam.csgo.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSGOUnitTests {
    static CsgoService api;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        api = new SteamAPI(token).getCsgoService();
    }

    @Test
    void csgoStatusTest() throws Exception {
        ServerStatus stat = api.getGameServerStatus();

        Assertions.assertNotNull(stat.getApp().getTimestamp());
        Assertions.assertNotNull(stat.getDatacenters().getChinaTianjin().getLoad());
        Assertions.assertNotNull(stat.getMatchmaking().getSearching_players());
        Assertions.assertNotNull(stat.getPerfectWorld().getPurchase().getLatency());
        Assertions.assertNotNull(stat.getServices().getSessionsLogon());
    }

    @Test
    void mapPlaytimeTest() throws Exception {
        MapPlaytime playtime = api.getMapPlaytime(Gamemode.CASUAL, Interval.DAY);

        Assertions.assertNotNull(playtime.getPlaytimes().get(0).getMapName());
        Assertions.assertNotNull(playtime.getKeys().get(1));
    }
}
