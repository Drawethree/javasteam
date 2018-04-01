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

import static pl.l7ssha.javasteam.utils.Links.friendListUrl;
import static pl.l7ssha.javasteam.utils.Links.userBansurl;
import static pl.l7ssha.javasteam.utils.Links.userSummaryUrl;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public class RichSteamUser implements ISteamUser, Userable {
    private Long steamId;
    private String nick;
    private String fullName;
    private String avatarUrl;

    public static RichSteamUser of(UserSummary summary) {
       return new RichSteamUser(summary);
    }

    private RichSteamUser(UserSummary summary) {
        steamId = summary.getSteamid();
        nick = summary.getNick();
        fullName = summary.getRealname();
        avatarUrl = summary.getAvatar();
    }

    public Long getSteamId() {
        return steamId;
    }

    public String getNick() {
        return nick;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
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
}
