package pl.l7ssha.javasteam.csgo;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;
import pl.l7ssha.javasteam.csgo.models.mapsplaytime.Map;
import pl.l7ssha.javasteam.csgo.models.mapsplaytime.MapPlaytime;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MapsPlaytimeDeserializer implements JsonDeserializer<MapPlaytime> {

    @Override
    public MapPlaytime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("result");

        ArrayList<String> keys = new Gson().fromJson(base.getAsJsonObject().get("Keys").getAsJsonArray(), ArrayList.class);
        JsonArray rows = base.getAsJsonObject().get("Rows").getAsJsonArray();

        ArrayList<Map> maps = new ArrayList<>();

        for(JsonElement arr: rows) {
            maps.add(new Map(arr.getAsJsonArray().get(0).getAsLong(),arr.getAsJsonArray().get(1).getAsString(), arr.getAsJsonArray().get(2).getAsDouble()));
        }

        return new MapPlaytime(keys, maps);
    }
}

