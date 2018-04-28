package pl.l7ssha.javasteam.utils.deserializers;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.*;
import pl.l7ssha.javasteam.steamuser.FriendList;
import pl.l7ssha.javasteam.steamuser.FriendListNode;
import pl.l7ssha.javasteam.utils.Utils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

public class FriendListDeserializer implements JsonDeserializer<FriendList> {

    @Override
    public FriendList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
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

        return new FriendList(tmp);
    }
}
