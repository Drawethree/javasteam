package pl.l7ssha.javasteam.test.benchmarks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamUserService;
import pl.l7ssha.javasteam.StoreFrontService;
import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.storefront.NamedSteamGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

// pl.l7ssha.javasteam.test
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Benchmarks {
    static StoreFrontService storeFrontService;
    static SteamUserService steamUserService;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        SteamAPI api = new SteamAPI(token);

        storeFrontService = api.getService(StoreFrontService.class);
        steamUserService = api.getService(SteamUserService.class);

        System.out.println("[BENCHMARK] Started");
    }

    @Test
    void benchStore() {
        System.out.println("\t [StoreAccessTime] Benchmark started");

        Instant starts = Instant.now();

        NamedSteamGame game = storeFrontService.getFullInfoOfApp("730");

        Instant ends = Instant.now();

        System.out.println("\t [StoreAccessTime] Benchmark ended: " + Duration.between(starts, ends).toMillis());
    }

    @Test
    void benchNamedUser() {
        System.out.println("\t [NamedUserCreationTime] Benchmark started");

        Instant starts = Instant.now();

        ISteamUser user = steamUserService.getSteamUser("l7ssha");

        Instant ends = Instant.now();

        System.out.println("\t [NamedUserCreationTime] Benchmark ended: " + Duration.between(starts, ends).toMillis());
    }

    @Test
    void benchAsync() {
        System.out.println("\t [AsyncStoreAccessTime] Benchmark started");

        Instant starts = Instant.now();

        storeFrontService.getFullInfoOfAppAsync("730").thenAccept(gameInfo -> {
            System.out.println("\t\t[GameInfo] " + gameInfo.getMetacritic().getScore());
        });

        Instant ends = Instant.now();

        System.out.println("\t [AsyncStoreAccessTime] Benchmark ended: " + Duration.between(starts, ends).toMillis());
    }
}
