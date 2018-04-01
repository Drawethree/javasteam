package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import pl.l7ssha.javasteam.csgo.MapsPlaytimeDeserializer;
import pl.l7ssha.javasteam.csgo.ServerStatusDeserializer;
import pl.l7ssha.javasteam.csgo.models.mapsplaytime.MapPlaytime;
import pl.l7ssha.javasteam.csgo.models.serverstatus.ServerStatus;

import java.io.IOException;
import java.lang.reflect.Type;

public class Responser {
    private static Gson gson = new GsonBuilder()
            .registerTypeAdapter(ServerStatus.class, new ServerStatusDeserializer())
            .registerTypeAdapter(MapPlaytime.class, new MapsPlaytimeDeserializer())
            .create();

    public static Object getResponse(String url, Type type) {
        HttpRequest req = HttpRequest.get(url);

        if(req.code() != 200) {
            throw new HttpRequest.HttpRequestException(new IOException("Server returned with code " + req.code() + ", with message: "+ req.body()));
        }

        return gson.fromJson(req.body(), type);
    }
}
