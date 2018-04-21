package pl.l7ssha.javasteam.utils.deserializers;

import com.google.gson.*;
import pl.l7ssha.javasteam.storefront.gamelist.GameListNode;
import pl.l7ssha.javasteam.utils.Utils;

import java.lang.reflect.Type;

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
                Utils.timestampToDate(base.get("last_modified").getAsLong()),
                base.get("price_change_number").getAsInt());
    }
}