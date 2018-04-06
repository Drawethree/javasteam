package pl.l7ssha.javasteam.schema;

// pl.l7ssha.javasteam.schema
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GameSchemaDeserializer implements JsonDeserializer<GameSchema> {
    Gson gson = new Gson();

    List<SchemaStat> tmpStats = new ArrayList<>();
    List<SchemaAchievement> tmpAchievements = new ArrayList<>();

    @Override
    public GameSchema deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject baseObject = json.getAsJsonObject().get("game").getAsJsonObject();

        String gamename = baseObject.get("gameName").getAsString();
        String gameVersion = baseObject.get("gameVersion").getAsString();

        JsonObject availableGameStats = baseObject.get("availableGameStats").getAsJsonObject();
        JsonArray stats = availableGameStats.get("stats").getAsJsonArray();
        JsonArray achievements = availableGameStats.get("achievements").getAsJsonArray();

        for(JsonElement elem : stats)
            tmpStats.add(gson.fromJson(elem, SchemaStat.class));

        for(JsonElement elem : achievements)
            tmpAchievements.add(gson.fromJson(elem, SchemaAchievement.class));


        return new GameSchema(gamename, gameVersion, tmpAchievements, tmpStats);
    }
}
