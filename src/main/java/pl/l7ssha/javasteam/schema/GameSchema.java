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

    /**
     * Name of game
     * @return String with name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Version of game
     * @return String with game version
     */
    public String getGameVersion() {
        return gameVersion;
    }

    /**
     * Retrieves game achievements with description
     * @return List of achievements
     */
    public List<SchemaAchievement> getAchievements() {
        return achievements;
    }

    /**
     * Retrieves game stats with description
     * @return List of stats
     */
    public List<SchemaStat> getStats() {
        return stats;
    }
}
