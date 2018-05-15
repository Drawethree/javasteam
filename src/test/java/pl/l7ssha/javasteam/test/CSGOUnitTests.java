package pl.l7ssha.javasteam.test;

// pl.l7ssha.javasteam.test.csgotest
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.CsgoService;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Gamemode;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Interval;
import pl.l7ssha.javasteam.csgo.mapsplaytime.Map;
import pl.l7ssha.javasteam.csgo.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CSGOUnitTests {
    static CsgoService api;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        api = new SteamAPI(token).getService(CsgoService.class);
    }

    @Test
    void csgoStatusTest() throws Exception {
        ServerStatus stat = api.getGameServerStatus();

        assertTrue(stat.getApp().getTimestamp() > 0);
        assertNotNull(stat.getDatacenters().getChinaTianjin().getLoad());
        assertTrue(stat.getMatchmaking().getOnlinePlayers() > 0);
        assertNotNull(stat.getPerfectWorld().getPurchase().getLatency());
        assertNotNull(stat.getServices().getSessionsLogon());
        assertNotNull(stat.getServices().getSteamCommunity());
            assertNotNull(stat.getDatacenters().getAustralia().getCapacity());
        assertNotNull(stat.getDatacenters().getEuEast());
    }

    @Test
    void mapPlaytimeTest() throws Exception {
        MapPlaytime playtime = api.getMapPlaytime(Gamemode.CASUAL, Interval.DAY);

        assertNotNull(playtime.getPlaytimes().get(0).getMapName());
        assertNotNull(playtime.getKeys().get(1));

        for(Map map: playtime.getPlaytimes())
            assertNotNull(map.getMapName());
    }
}
