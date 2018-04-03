package pl.l7ssha.javasteam.steamuser;

import com.google.gson.reflect.TypeToken;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;
import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.Responser;
import pl.l7ssha.javasteam.vanity.VanityUrl;
import pl.l7ssha.javasteam.vanity.VanityUrlType;

import java.util.ArrayList;
import java.util.List;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

public class NamedSteamUser implements ISteamUser {
    private Long steamId;
    private String nick;

    public NamedSteamUser(String nick) {
        this.nick = nick;
        this.steamId = ((VanityUrl) Responser.getResponse(String.format(Links.vanityUrl, nick, VanityUrlType.PROFILE.getValue()), VanityUrl.class)).getSteamId();
    }

    @Override
    public List<FriendListNode> getFriendList() {
        return (ArrayList<FriendListNode>) getResponse(String.format(friendListUrl, steamId), new TypeToken<List<FriendListNode>>() { }.getType());
    }

    @Override
    public UserBans getUserBans() {
        return (UserBans) getResponse(String.format(userBansurl, steamId), UserBans.class);
    }

    @Override
    public UserSummary getUserSummary() {
        return (UserSummary) getResponse(String.format(userSummaryUrl, steamId), UserSummary.class);
    }
}
