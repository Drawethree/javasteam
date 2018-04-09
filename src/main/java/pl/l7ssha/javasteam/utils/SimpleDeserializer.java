package pl.l7ssha.javasteam.utils;

import com.google.gson.*;

import java.lang.reflect.Type;

// pl.l7ssha.javasteam.utils
//
// Date created: 08 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class SimpleDeserializer<T> implements JsonDeserializer<T> {
    Type type;

    public SimpleDeserializer(Class<T> type) {
        this.type = type;
    }

    @Override
    public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("response");

        return new Gson().fromJson(base, type);
    }
}
