package pl.l7ssha.javasteam.storefront.gameuptodate;

// pl.l7ssha.javasteam.storefront.gameuptodate
//
// Date created: 10 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;

import java.lang.reflect.Type;

public class IGameVersionDeserializer implements JsonDeserializer<IGameVersion> {

    Gson gson = new Gson();

    @Override
    public IGameVersion deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("response");

        if(base.getAsJsonObject().get("up_to_date").getAsBoolean())
            return gson.fromJson(base, GameVersionNew.class);

        return gson.fromJson(base, GameVersionOld.class);
    }
}
