package pl.l7ssha.javasteam.storefront.models.steamgame;

// pl.l7ssha.javasteam.storefront.models.steamgame
//
// Date created: 04 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;

import java.lang.reflect.Type;

public class CurrentPlayersDeserializer implements JsonDeserializer<CurrentPlayers> {

    @Override
    public CurrentPlayers deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("response");

        return new Gson().fromJson(base, CurrentPlayers.class);
    }
}
