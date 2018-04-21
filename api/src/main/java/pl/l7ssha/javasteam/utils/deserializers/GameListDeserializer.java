package pl.l7ssha.javasteam.utils.deserializers;

import com.google.gson.*;
import pl.l7ssha.javasteam.storefront.gamelist.GameList;
import pl.l7ssha.javasteam.storefront.gamelist.GameListNode;

import java.lang.reflect.Type;

// pl.l7ssha.javasteam.storefront.models.gamelist
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class GameListDeserializer implements JsonDeserializer<GameList> {
    @Override
    public GameList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("response");

        return new GsonBuilder().registerTypeAdapter(GameListNode.class, new GameListNodeDeserializer()).create().fromJson(base, GameList.class);
    }
}
