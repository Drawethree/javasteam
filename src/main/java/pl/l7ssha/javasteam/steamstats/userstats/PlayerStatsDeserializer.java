package pl.l7ssha.javasteam.steamstats.userstats;

import com.google.gson.*;

import java.lang.reflect.Type;

// pl.l7ssha.javasteam.steamstats.userstats
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class PlayerStatsDeserializer implements JsonDeserializer<PlayerStats> {
    @Override
    public PlayerStats deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("playerstats");

        return new Gson().fromJson(base, PlayerStats.class);
    }
}
