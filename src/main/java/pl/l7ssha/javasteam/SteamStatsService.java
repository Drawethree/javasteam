package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.steamstats.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.utils.annotation.Blocking;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.appSchemaUrl;
import static pl.l7ssha.javasteam.utils.Links.globalAchievementsUrl;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public class SteamStatsService {
    SteamStatsService() { }

    public GameSchema getSchemaForGame(String id, String lang) {
        return (GameSchema) getResponse(String.format(appSchemaUrl, id, lang), GameSchema.class);
    }

    public CompletableFuture<GameSchema> getSchemaAsync(String id, String lang) {
        return CompletableFuture.supplyAsync(() -> getSchemaForGame(id, lang));
    }

    //LONG METHOD NAMES HELL // PROBABLY TO CHANGE
    @Blocking
    public AchievementsGlobalPercentages getGlobalAchievementsPercentagesWithDescription(String id) {
        GameSchema schema = (GameSchema) getResponse(String.format(appSchemaUrl, id, "ENG"), GameSchema.class);

        AchievementsGlobalPercentages percentages = (AchievementsGlobalPercentages) getResponse(String.format(globalAchievementsUrl, id), AchievementsGlobalPercentages.class);

        return percentages.complete(schema);
    }

    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesWithDescriptionAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentagesWithDescription(id));
    }

    public AchievementsGlobalPercentages getGlobalAchievementsPercentages(String id) {
        return (AchievementsGlobalPercentages) getResponse(String.format(globalAchievementsUrl, id), AchievementsGlobalPercentages.class);
    }

    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentages(id));
    }
}
