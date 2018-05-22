package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam.utils
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.sql.Timestamp;
import java.util.Date;

public class Utils {
    public static Date timestampToDate(long timestamp) {
        return new Date(new Timestamp(timestamp * 1000).getTime());
    }

    public static JsonElement deserializeObjectWithCancer(JsonElement json) {
        JsonObject base = json.getAsJsonObject();
        JsonElement firstGame = null;

        firstGame = base.entrySet().iterator().next().getValue();

        if(firstGame == null)
            return null;

        return firstGame.getAsJsonObject().get("data");
    }
}
