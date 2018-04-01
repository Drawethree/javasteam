package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.reflect.TypeToken;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.utils.Responser;

import java.util.ArrayList;
import java.util.List;

public class SteamUser implements ISteamUser, IUser {
    private final String friendListUrl = "https://api.steampowered.com/ISteamUser/getFriendList/v1/?steamid=%s&key=";
    private final String userBansurl = "https://api.steampowered.com/ISteamUser/GetPlayerBans/v1/?format=json&steamids=%s&key=";

    private final Long steamId;

    public SteamUser(Long id) {
        steamId = id;
    }

    public Long getSteamId() {
        return steamId;
    }

    @Override
    public List<FriendListNode> getFriendList() {
        return (ArrayList<FriendListNode>)Responser.getResponse(String.format(friendListUrl, steamId), new TypeToken<List<FriendListNode>>() { }.getType());
    }

    @Override
    public UserBans getUserBans() {
        return (UserBans) Responser.getResponse(String.format(userBansurl, steamId), UserBans.class);
    }

    @Override
    public ISteamUser getSteamUser() {
        return this;
    }
}
