package pl.l7ssha.javasteam.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.l7ssha.javasteam.SteamAPI;
import pl.l7ssha.javasteam.SteamStatsService;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.steamstats.AchievementsGlobalPercentages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

// pl.l7ssha.javasteam.test
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class StatTests {
    static SteamStatsService statsService;

    @BeforeAll
    static void getToken() throws IOException {
        String token = Files.readAllLines(Paths.get("token.txt")).get(0);
        statsService = new SteamAPI(token).getStatService();
    }

    @Test
    void testGameSchema() {
        GameSchema csgoSchema = statsService.getSchemaForGame("730", "ENG");

        assertNotNull(csgoSchema.getGameVersion());
        assertNotNull(csgoSchema.getAchievements().get(1).getIconGray());
        assertNotNull(csgoSchema.getStats().get(10).getDisplayName());
    }

    @Test
    void globalAchievementsWithoutDescription() {
        AchievementsGlobalPercentages percentages = statsService.getGlobalAchievementsPercentages("730");

        assertNotNull(percentages.getAchievements().get(10).getName());
        assertNull(percentages.getAchievements().get(5).getDescription());
    }

    @Test
    void globalAchievementsWithDescription() {
        AchievementsGlobalPercentages percentages = statsService.getGlobalAchievementsPercentagesWithDescription("730");

        assertNotNull(percentages.getAchievements().get(10).getName());
        assertNotNull(percentages.getAchievements().get(5).getDescription());
    }
}
