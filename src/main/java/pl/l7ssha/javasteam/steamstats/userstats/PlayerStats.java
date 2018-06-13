package pl.l7ssha.javasteam.steamstats.userstats;

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.schema.GameSchema;
import pl.l7ssha.javasteam.schema.SchemaStat;

import java.util.Iterator;
import java.util.List;

import static pl.l7ssha.javasteam.utils.Links.appSchemaUrl;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

// pl.l7ssha.javasteam.steamstats.userstats
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class PlayerStats implements Iterable<PlayerStat> {
    @SerializedName("steamID")
    private Long steamId;
    private String gameName;

    @SerializedName("stats")
    private List<PlayerStat> playerStats;

    public PlayerStats() {}

    /**
     * SteamId of user that data is requested
     * @return Id as Long
     */
    public Long getSteamId() {
        return steamId;
    }

    /**
     * Name of game which is data requested
     * @return String width game name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Players statistics data without descriptions.
     * @return List of player's statistics
     */
    public List<PlayerStat> getPlayerStats() {
        return playerStats;
    }

    /**
     * Players statistics data with description. It can block thread because of loop implementation.
     * @param gameId Game id to get descriptions
     * @return List of players stats
     */
    public List<PlayerStat> getPlayerStatsWithDescription(Long gameId) {
        GameSchema schema = getGenericResponse(String.format(appSchemaUrl, gameId, "ENG"), GameSchema.class);
        List<SchemaStat> schemaAchievements = schema.getStats();

        for (PlayerStat s : playerStats) {
            String desc = "";

            for (SchemaStat schemanode : schemaAchievements)
                if (s.getName().equals(schemanode.getName()))
                    desc = schemanode.getDisplayName();

            s.setDescription(desc);
        }

        return playerStats;
    }

    @Override
    public Iterator<PlayerStat> iterator() {
        return playerStats.iterator();
    }
}
