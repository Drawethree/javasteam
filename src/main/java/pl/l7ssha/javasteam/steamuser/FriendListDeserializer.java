package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.*;
import pl.l7ssha.javasteam.utils.Utils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendListDeserializer implements JsonDeserializer<List<FriendListNode>> {

    @Override
    public List<FriendListNode> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("friendslist");
        JsonArray friends = base.getAsJsonObject().get("friends").getAsJsonArray();

        ArrayList<FriendListNode> tmp = new ArrayList<>();

        for(JsonElement i: friends) {
            JsonObject ii = i.getAsJsonObject();

            Long steamid = ii.get("steamid").getAsLong();
            String relationship = ii.get("relationship").getAsString();
            Date timestamp = Utils.timestampToDate(ii.get("friend_since").getAsLong());

            tmp.add(new FriendListNode(steamid, relationship, timestamp));
        }

        return tmp;
    }
}
