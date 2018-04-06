package pl.l7ssha.javasteam.steamstats;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.schema.SchemaAchievement;

import java.util.List;

public class AchievementsGlobalPercentages {
    private List<StatAchievement> achievements;

    public AchievementsGlobalPercentages(List<StatAchievement> achievements) {
        this.achievements = achievements;
    }

    public AchievementsGlobalPercentages complete(GameSchema schema) {
        List<SchemaAchievement> schemaAchievements = schema.getAchievements();

        for(StatAchievement a: this.achievements) {
            String desc = "";

            for(SchemaAchievement schemanode: schemaAchievements)
                if(a.getName().equals(schemanode.getName()))
                    desc = schemanode.getDescription();

            a.setDescription(desc);
        }

        return this;
    }

    public List<StatAchievement> getAchievements() {
        return achievements;
    }
}
