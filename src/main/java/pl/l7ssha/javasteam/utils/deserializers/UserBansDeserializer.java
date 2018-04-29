package pl.l7ssha.javasteam.utils.deserializers;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.*;
import pl.l7ssha.javasteam.steamuser.UserBans;

import java.lang.reflect.Type;

public class UserBansDeserializer implements JsonDeserializer<UserBans> {

    @Override
    public UserBans deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if(json.getAsJsonObject().get("players").getAsJsonArray().size() == 0)
            return null;

        JsonElement base = json.getAsJsonObject().get("players").getAsJsonArray().get(0);
        return new Gson().fromJson(base, UserBans.class);
    }
}
