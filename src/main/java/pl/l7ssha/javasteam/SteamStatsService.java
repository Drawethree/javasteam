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
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;
import static pl.l7ssha.javasteam.utils.Utils.completeAchievementGlobal;

public class SteamStatsService {
    SteamStatsService() { }

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

    //LONG METHOD NAMES HELL // PROBABLY TO CHANGE
    /**
     * Returns global achievements percentages with descriptions in English.
     * @param id App (game) ID
     * @return AchievementsGlobalPercentages
     */
    @Blocking
    public AchievementsGlobalPercentages getGlobalAchievementsPercentagesWithDescription(String id) {
        GameSchema schema = getGenericResponse(String.format(appSchemaUrl, id, "ENG"), GameSchema.class);

        AchievementsGlobalPercentages percentages = getGenericResponse(String.format(globalAchievementsUrl, id), AchievementsGlobalPercentages.class);

        return completeAchievementGlobal(percentages, schema);
    }

    /**
     * Asynchronously returns global achievements percentages with descriptions in English.
     * @param id App (game) ID
     * @return CompletableFuture<AchievementsGlobalPercentages>
     */
    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesWithDescriptionAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentagesWithDescription(id));
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
     * @return CompletableFuture<AchievementsGlobalPercentages>
     */
    public CompletableFuture<AchievementsGlobalPercentages> getGlobalAchievementsPercentagesAsync(String id) {
        return CompletableFuture.supplyAsync(() -> getGlobalAchievementsPercentages(id));
    }
}
