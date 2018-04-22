package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.schema.SchemaAchievement;
import pl.l7ssha.javasteam.schema.SchemaStat;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.steamstats.globalachievements.StatAchievement;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStat;
import pl.l7ssha.javasteam.steamstats.userstats.PlayerStats;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Utils {
    public static Date timestampToDate(long timestamp) {
        return new Date(new Timestamp(timestamp * 1000).getTime());
    }

    public static JsonElement deserializeObjectWithCancer(JsonElement json) {
        JsonObject base = json.getAsJsonObject();
        JsonElement firstGame = null;

        firstGame = base.entrySet().iterator().next().getValue();

        if(firstGame == null)
            return null;

        return firstGame.getAsJsonObject().get("data");
    }

    public static AchievementsGlobalPercentages completeAchievementGlobal(AchievementsGlobalPercentages perc, GameSchema schema) {
        List<SchemaAchievement> schemaAchievements = schema.getAchievements();

        for(StatAchievement a: perc.getAchievements()) {
            String desc = "";

            for(SchemaAchievement schemanode: schemaAchievements)
                if(a.getName().equals(schemanode.getName()))
                    desc = schemanode.getDescription();

            a.setDescription(desc);
        }

        return perc;
    }

    public static PlayerStats completePlayerStats(PlayerStats stats, GameSchema schema) {
        List<SchemaStat> schemaAchievements = schema.getStats();

        for(PlayerStat s: stats.getPlayerStats()) {
            String desc = "";

            for(SchemaStat schemanode: schemaAchievements)
                if(s.getName().equals(schemanode.getName()))
                    desc = schemanode.getDisplayName();

            s.setDescription(desc);
        }

        return stats;
    }

}
