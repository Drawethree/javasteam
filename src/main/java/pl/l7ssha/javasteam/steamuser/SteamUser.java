package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.reflect.TypeToken;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;

import java.util.ArrayList;
import java.util.List;

import static pl.l7ssha.javasteam.utils.Links.*;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public class SteamUser implements ISteamUser, Userable {
    private final Long steamId;

    public SteamUser(Long id) {
        steamId = id;
    }

    public Long getSteamId() {
        return steamId;
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

    @Override
    public ISteamUser getSteamUser() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof SteamUser)
           return this.steamId.equals(((SteamUser)o).getSteamId());

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s", this.steamId);
    }
}
