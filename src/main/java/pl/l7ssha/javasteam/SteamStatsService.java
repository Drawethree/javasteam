package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.appSchemaUrl;
import static pl.l7ssha.javasteam.utils.Links.globalAchievementsUrl;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class SteamStatsService implements ISteamService{
    /**
     * Returns schema for specified game and lang. Schema provide description for achievements and stats.
     * @param id Id of app
     * @param lang Return data language
     * @return GameSchema
     */
    public GameSchema getSchema(String id, String lang) {
        return getGenericResponse(String.format(appSchemaUrl, id, lang), GameSchema.class);
    }

    /**
     * Asynchronously returns schema for specified game and lang. Schema provide description for achievements and stats.
     * @param id Id of app
     * @param lang Return data language
     * @return GameSchema
     */
    public CompletableFuture<GameSchema> getSchemaAsync(String id, String lang) {
        return CompletableFuture.supplyAsync(() -> getSchema(id, lang));
    }

    /**
     * Returns bare-bones global achievements percentages
     * @param id App (game) ID
     * @return AchievementsGlobalPercentages
     */
    public AchievementsGlobalPercentages getGlobalAchievementsPercentages(String id) {
        return getGenericResponse(String.format(globalAchievementsUrl, id), AchievementsGlobalPercentages.class);
    }

    /**
     * Asynchronously returns bare-bones global achievements percentages
     * @param id App (game) ID
     * @return CompletableFuture
     */
    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentages(id));
    }


}
