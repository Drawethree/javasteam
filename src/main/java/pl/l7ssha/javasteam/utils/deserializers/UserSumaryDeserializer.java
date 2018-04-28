package pl.l7ssha.javasteam.utils.deserializers;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.*;
import pl.l7ssha.javasteam.steamuser.usersummary.PersonaState;
import pl.l7ssha.javasteam.steamuser.usersummary.ProfileVisibilityState;
import pl.l7ssha.javasteam.steamuser.usersummary.UserSummary;
import pl.l7ssha.javasteam.utils.Utils;

import java.lang.reflect.Type;
import java.util.Date;

public class UserSumaryDeserializer implements JsonDeserializer<UserSummary> {

    @Override
    public UserSummary deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject base = json.getAsJsonObject().get("response").getAsJsonObject().get("players").getAsJsonArray().get(0).getAsJsonObject();

        Long steamId = base.get("steamid").getAsLong();
        ProfileVisibilityState profileVisibilityState = ProfileVisibilityState.of(base.get("communityvisibilitystate").getAsInt());
        PersonaState personaState = PersonaState.values()[base.get("personastate").getAsInt()];
        boolean profileState = base.get("profilestate").getAsBoolean();
        String nick = base.get("personaname").getAsString();
        Date lastLogOff = Utils.timestampToDate(base.getAsJsonObject().get("lastlogoff").getAsLong());
        boolean commentPerm = base.get("commentpermission").getAsBoolean();
        String profileUrl = base.get("profileurl").getAsString();
        String avatar = base.get("avatar").getAsString();
        String avatarmedium = base.get("avatarmedium").getAsString();
        String avatarfull = base.get("avatarfull").getAsString();
        String realname = base.get("realname").getAsString();
        Long clanId = base.get("primaryclanid").getAsLong();
        Date timecreated =  Utils.timestampToDate(base.getAsJsonObject().get("timecreated").getAsLong());
        int personaStateFlags = base.get("personastateflags").getAsInt();
        String countryCode = base.get("loccountrycode").getAsString();

        String gamextra = null;
        Long gameid = null;

        try {
            gamextra = base.get("gameextrainfo").getAsString();
            gameid = base.get("gameid").getAsLong();
        }
        catch (Exception e) { }

        return new UserSummary(steamId, profileVisibilityState, personaState, profileState, nick, lastLogOff, commentPerm, profileUrl, avatar, avatarmedium, avatarfull, realname, clanId, timecreated, personaStateFlags, countryCode, gamextra, gameid);
    }
}
