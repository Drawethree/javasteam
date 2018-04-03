package pl.l7ssha.javasteam.storefront.models.gamelist;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.Date;

// pl.l7ssha.javasteam.storefront
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class GameListNodeDeserializer implements JsonDeserializer<GameListNode> {
    @Override
    public GameListNode deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject base = json.getAsJsonObject();

        return new GameListNode(base.get("name").getAsString(),
                base.get("appid").getAsLong(),
                new Date(new Timestamp(base.get("last_modified").getAsLong() * 1000).getTime()),
                base.get("price_change_number").getAsInt());
    }
}