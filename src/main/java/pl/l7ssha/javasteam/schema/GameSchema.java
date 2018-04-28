package pl.l7ssha.javasteam.schema;

import java.util.List;

// pl.l7ssha.javasteam.schema
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class GameSchema {
    private String gameName;
    private String gameVersion;

    private List<SchemaAchievement> achievements;
    private List<SchemaStat> stats;

    public GameSchema(String gameName, String gameVersion, List<SchemaAchievement> achievements, List<SchemaStat> stats) {
        this.gameName = gameName;
        this.gameVersion = gameVersion;
        this.achievements = achievements;
        this.stats = stats;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public List<SchemaAchievement> getAchievements() {
        return achievements;
    }

    public List<SchemaStat> getStats() {
        return stats;
    }
}
