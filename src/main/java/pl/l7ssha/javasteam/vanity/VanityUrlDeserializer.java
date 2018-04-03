package pl.l7ssha.javasteam.vanity;

// pl.l7ssha.javasteam.vanity
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;

import java.lang.reflect.Type;

public class VanityUrlDeserializer implements JsonDeserializer<VanityUrl> {

    @Override
    public VanityUrl deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("response");

        return new Gson().fromJson(base, VanityUrl.class);
    }
}
