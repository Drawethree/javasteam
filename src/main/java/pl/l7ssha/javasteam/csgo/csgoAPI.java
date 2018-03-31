package pl.l7ssha.javasteam.csgo;

// pl.l7ssha.javasteam.csgo
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.github.kittinunf.result.Result;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Triple;
import pl.l7ssha.javasteam.csgo.models.serverstatus.ServerStatus;

import java.lang.reflect.Type;

public class csgoAPI {
    private final String token;
    private final String serverStatusUrl = "https://api.steampowered.com/ICSGOServers_730/GetGameServersStatus/v1/?key=%s";

    private Gson gson = new GsonBuilder().registerTypeAdapter(ServerStatus.class, new ServerStatusDeserializer()).create();

    public csgoAPI(String token) {
        this.token = token;
    }

    public ServerStatus getGameServerStatus() throws Exception {
        ServerStatus status;

        return (ServerStatus) deserialize(serverStatusUrl, ServerStatus.class);
    }


    private Object deserialize(String url, Type type) throws Exception{
        Triple<Request, Response, Result<String, FuelError>> resp = Fuel.get(String.format(url, token)).responseString();

        if(resp.component3().component2() != null)
            throw new Exception(resp.component3().component2().getException());

        return gson.fromJson(resp.component3().component1(), type);
    }
}