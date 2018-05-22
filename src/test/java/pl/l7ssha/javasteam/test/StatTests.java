package pl.l7ssha.javasteam.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamStatsService;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.steamstats.globalachievements.StatAchievement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// pl.l7ssha.javasteam.test
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class StatTests {
    static SteamStatsService statsService;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        statsService = new SteamAPI(token).getService(SteamStatsService.class);
    }

    @Test
    void testGameSchema() {
        GameSchema csgoSchema = statsService.getSchema("730", "ENG");

        assertNotNull(csgoSchema.getGameVersion());
        assertNotNull(csgoSchema.getAchievements().get(1).getIconGray());
        assertNotNull(csgoSchema.getStats().get(10).getDisplayName());
        assertNotNull(csgoSchema.getGameName());
    }

    @Test
    void globalAchievementsWithoutDescription() {
        AchievementsGlobalPercentages percentages = statsService.getGlobalAchievementsPercentages("730");

        assertNotNull(percentages.getAchievements().get(10).getName());
        //assertNull(percentages.getAchievements().get(5).getDescription());
    }

    @Test
    void globalAchievementsWithDescription() {
        List<StatAchievement> achievementsWithDescription = statsService.getGlobalAchievementsPercentages("730").getAchievementsWithDescription(730L);

        assertNotNull(achievementsWithDescription.get(10).getName());
        assertNotNull(achievementsWithDescription.get(5).getDescription());
    }
}
