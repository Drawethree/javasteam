package pl.l7ssha.javasteam.utils.deserializers;

import com.google.gson.*;
import pl.l7ssha.javasteam.steamstats.globalachievements.AchievementsGlobalPercentages;
import pl.l7ssha.javasteam.steamstats.globalachievements.StatAchievement;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class AchievementsGlobalPercentagesDeserializer implements JsonDeserializer<AchievementsGlobalPercentages> {
    Gson gson = new Gson();
    List<StatAchievement> tmp = new ArrayList<>();

    @Override
    public AchievementsGlobalPercentages deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray achievements = json.getAsJsonObject().get("achievementpercentages").getAsJsonObject().get("achievements").getAsJsonArray();

        for(JsonElement elem : achievements)
            tmp.add(gson.fromJson(elem, StatAchievement.class));

        return new AchievementsGlobalPercentages(tmp);
    }
}
