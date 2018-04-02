package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import pl.l7ssha.javasteam.steamuser.models.usersummary.PersonaState;
import pl.l7ssha.javasteam.steamuser.models.usersummary.ProfileVisibilityState;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.Date;

public class UserSumaryDeserializer implements JsonDeserializer<UserSummary> {

    @Override
    public UserSummary deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("response").getAsJsonObject().get("players").getAsJsonArray().get(0);

        Long steamId = base.getAsJsonObject().get("steamid").getAsLong();
        ProfileVisibilityState profileVisibilityState = ProfileVisibilityState.of(base.getAsJsonObject().get("communityvisibilitystate").getAsInt());
        PersonaState personaState = PersonaState.values()[base.getAsJsonObject().get("personastate").getAsInt()];
        boolean profileState = base.getAsJsonObject().get("profilestate").getAsBoolean();
        String nick = base.getAsJsonObject().get("personaname").getAsString();
        Date lastLogOff = new Date(new Timestamp(base.getAsJsonObject().get("lastlogoff").getAsLong() * 1000).getTime());
        boolean commentPerm = base.getAsJsonObject().get("commentpermission").getAsBoolean();
        String profileUrl = base.getAsJsonObject().get("profileurl").getAsString();
        String avatar = base.getAsJsonObject().get("avatar").getAsString();
        String avatarmedium = base.getAsJsonObject().get("avatarmedium").getAsString();
        String avatarfull = base.getAsJsonObject().get("avatarfull").getAsString();
        String realname = base.getAsJsonObject().get("realname").getAsString();
        Long clanId = base.getAsJsonObject().get("primaryclanid").getAsLong();
        Date timecreated =  new Date(new Timestamp(base.getAsJsonObject().get("timecreated").getAsLong() * 1000).getTime());
        int personaStateFlags = base.getAsJsonObject().get("personastateflags").getAsInt();
        String countryCode = base.getAsJsonObject().get("loccountrycode").getAsString();

        return new UserSummary(steamId, profileVisibilityState, personaState, profileState, nick, lastLogOff, commentPerm, profileUrl, avatar, avatarmedium, avatarfull, realname, clanId, timecreated, personaStateFlags, countryCode);
    }
}
