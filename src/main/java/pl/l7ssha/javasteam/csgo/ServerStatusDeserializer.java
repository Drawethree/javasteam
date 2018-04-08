package pl.l7ssha.javasteam.csgo;

import com.google.gson.*;
import pl.l7ssha.javasteam.csgo.serverstatus.ServerStatus;

import java.lang.reflect.Type;

// pl.l7ssha.javasteam.csgo
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class ServerStatusDeserializer implements JsonDeserializer<ServerStatus> {

    @Override
    public ServerStatus deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement cnt = json.getAsJsonObject().get("result");

        return new GsonBuilder().setDateFormat("EEE MMM dd HH:mm:ss YYYY").create().fromJson(cnt, ServerStatus.class);
    }
}