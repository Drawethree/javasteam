package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;
import pl.l7ssha.javasteam.steamuser.models.UserBans;

import java.lang.reflect.Type;

public class UserBansDeserializer implements JsonDeserializer<UserBans> {

    @Override
    public UserBans deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("players").getAsJsonArray().get(0);

       return new Gson().fromJson(base, UserBans.class);
    }
}
