package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.utils.annotation.Blocking;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.appSchemaUrl;
import static pl.l7ssha.javasteam.utils.Links.globalAchievementsUrl;
import static pl.l7ssha.javasteam.utils.Utils.completeAchievementGlobal;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getResponse;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class SteamStatsService {
    SteamStatsService() { }

    public GameSchema getSchema(String id, String lang) {
        return getGenericResponse(String.format(appSchemaUrl, id, lang), GameSchema.class);
    }

    public CompletableFuture<GameSchema> getSchemaAsync(String id, String lang) {
        return CompletableFuture.supplyAsync(() -> getSchema(id, lang));
    }

    //LONG METHOD NAMES HELL // PROBABLY TO CHANGE
    @Blocking
    public AchievementsGlobalPercentages getGlobalAchievementsPercentagesWithDescription(String id) {
        GameSchema schema = getGenericResponse(String.format(appSchemaUrl, id, "ENG"), GameSchema.class);

        AchievementsGlobalPercentages percentages = getGenericResponse(String.format(globalAchievementsUrl, id), AchievementsGlobalPercentages.class);

        return completeAchievementGlobal(percentages, schema);
    }

    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesWithDescriptionAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentagesWithDescription(id));
    }

    public AchievementsGlobalPercentages getGlobalAchievementsPercentages(String id) {
        return getGenericResponse(String.format(globalAchievementsUrl, id), AchievementsGlobalPercentages.class);
    }

    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentages(id));
    }
}
