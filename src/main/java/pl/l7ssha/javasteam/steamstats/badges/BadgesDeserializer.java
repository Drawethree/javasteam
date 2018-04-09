package pl.l7ssha.javasteam.steamstats.badges;

import com.google.gson.*;
import pl.l7ssha.javasteam.utils.Utils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// pl.l7ssha.javasteam.steamstats.badges
//
// Date created: 09 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class BadgesDeserializer implements JsonDeserializer<Badges> {
    List<Badge> tmpBadges = new ArrayList<>();

    @Override
    public Badges deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject base = json.getAsJsonObject().get("response").getAsJsonObject();

        JsonArray basebadges = base.get("badges").getAsJsonArray();

        for(JsonElement e : basebadges) {
            JsonObject item = e.getAsJsonObject();

            if(item.has("communityitemid"))
                tmpBadges.add(createGameBadge(item));
            else
                tmpBadges.add(createBadge(item));
        }

        int playerxp = base.get("player_xp").getAsInt();
        int playerLevel = base.get("player_level").getAsInt();
        int xptonextLevel = base.get("player_xp_needed_to_level_up").getAsInt();
        int xpcurrentlevel = base.get("player_xp_needed_current_level").getAsInt();

        return new Badges(tmpBadges, playerxp, playerLevel, xptonextLevel, xpcurrentlevel);
    }

    private GameBadge createGameBadge(JsonObject obj) {
        int badgeId = obj.get("badgeid").getAsInt();
        long appid = obj.get("appid").getAsLong();
        int level = obj.get("level").getAsInt();
        Date time = Utils.timestampToDate(obj.get("completion_time").getAsLong());
        int xp = obj.get("xp").getAsInt();
        long communityitemid = obj.get("communityitemid").getAsLong();
        int borderColor = obj.get("border_color").getAsInt();
        int scaracity = obj.get("scarcity").getAsInt();

        return new GameBadge(badgeId, level, time, xp, scaracity, appid, communityitemid, borderColor);
    }


    private Badge createBadge(JsonObject obj) {
        int badgeId = obj.get("badgeid").getAsInt();
        int level = obj.get("level").getAsInt();
        Date time = Utils.timestampToDate(obj.get("completion_time").getAsLong());
        int xp = obj.get("xp").getAsInt();
        int scaracity = obj.get("scarcity").getAsInt();

        return new LiteBadge(badgeId, level, time, xp, scaracity);
    }
}
