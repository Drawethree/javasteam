package pl.l7ssha.javasteam.storefront.models;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;

public class SteamGameDeserializer implements JsonDeserializer<RichSteamGame> {

    @Override
    public RichSteamGame deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject base = json.getAsJsonObject();

        JsonElement firstGame = null;

        for(Map.Entry<String, JsonElement> ent: base.entrySet()) {
            firstGame = ent.getValue();
            break;
        }

        if(firstGame == null)
            return null;

        JsonElement firstData = firstGame.getAsJsonObject().get("data");

        return new Gson().fromJson(firstData, RichSteamGame.class);
    }
}
