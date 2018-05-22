package pl.l7ssha.javasteam.steamstats.globalachievements;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.schema.SchemaAchievement;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.appSchemaUrl;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class AchievementsGlobalPercentages implements Iterable<StatAchievement> {
    private List<StatAchievement> achievements;

    public AchievementsGlobalPercentages(List<StatAchievement> achievements) {
        this.achievements = achievements;
    }

    /**
     * List of achievements of game with their global completion percentages.
     * @return List of Achievements stats
     */
    public List<StatAchievement> getAchievements() {
        return achievements;
    }

    /**
     * Gets list of achievements with stats but also fetches for descriptions to provide complete data set.
     * @param gameId Achievements game Id
     * @return List of Achievements stats with descriptions
     */
    public List<StatAchievement> getAchievementsWithDescription(Long gameId) {
        GameSchema schema = getGenericResponse(String.format(appSchemaUrl, gameId, "ENG"), GameSchema.class);
        List<SchemaAchievement> schemaAchievements = schema.getAchievements();

        for(StatAchievement a: achievements) {
            String desc = "";

            for(SchemaAchievement schemanode: schemaAchievements)
                if(a.getName().equals(schemanode.getName()))
                    desc = schemanode.getDescription();

            a.setDescription(desc);
        }

        return achievements;
    }

    /**
     * Asynchronously Gets list of achievements with stats but also fetches for descriptions to provide complete data set.
     * @param gameId Achievements game Id
     * @return List of Achievements stats with descriptions
     */
    public CompletableFuture<List<StatAchievement>> getAchievementsWithDescriptionAsync(Long gameId) {
        return CompletableFuture.supplyAsync(() -> getAchievementsWithDescription(gameId));
    }

    @Override
    public Iterator<StatAchievement> iterator() {
        return achievements.iterator();
    }
}
