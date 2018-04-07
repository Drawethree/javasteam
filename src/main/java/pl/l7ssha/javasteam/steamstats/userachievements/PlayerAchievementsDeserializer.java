package pl.l7ssha.javasteam.steamstats.userachievements;

import com.google.gson.*;

import java.lang.reflect.Type;

// pl.l7ssha.javasteam.steamstats.userachievements
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class PlayerAchievementsDeserializer implements JsonDeserializer<PlayerAchievements> {
    @Override
    public PlayerAchievements deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("playerstats");

        return new GsonBuilder().registerTypeAdapter(PlayerAchievement.class, new PlayerAchievementDeserializer()).create().fromJson(base, PlayerAchievements.class);
    }
}
