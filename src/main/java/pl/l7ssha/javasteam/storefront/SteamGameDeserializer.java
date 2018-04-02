package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;

import java.lang.reflect.Type;

import static pl.l7ssha.javasteam.utils.Responser.deserializeObjectWithCancer;

public class SteamGameDeserializer implements JsonDeserializer<RichSteamGame> {

    @Override
    public RichSteamGame deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement firstData = deserializeObjectWithCancer(json);

        return new Gson().fromJson(firstData, RichSteamGame.class);
    }
}
