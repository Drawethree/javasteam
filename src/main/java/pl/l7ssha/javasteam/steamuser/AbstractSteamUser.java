package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.reflect.TypeToken;
import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.friendListUrl;
import static pl.l7ssha.javasteam.utils.Links.userBansUrl;
import static pl.l7ssha.javasteam.utils.Links.userSummaryUrl;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public abstract class AbstractSteamUser implements ISteamUser {
    protected Long steamId;

    public Long getSteamId() {
        return steamId;
    }

    protected AbstractSteamUser(Long steamId) {
        this.steamId = steamId;
    }

    @Override
    public List<FriendListNode> getFriendList() {
        return (ArrayList<FriendListNode>) getResponse(String.format(friendListUrl, steamId), new TypeToken<List<FriendListNode>>() { }.getType());
    }

    @Override
    public CompletableFuture<List<FriendListNode>> getFriendListAsync() {
        return CompletableFuture.supplyAsync(this::getFriendList);
    }

    @Override
    public UserBans getUserBans() {
        return (UserBans) getResponse(String.format(userBansUrl, steamId), UserBans.class);
    }

    @Override
    public CompletableFuture<UserBans> getUserBansAsync() {
        return CompletableFuture.supplyAsync(() -> (getUserBans()));
    }

    @Override
    public UserSummary getUserSummary() {
        return (UserSummary) getResponse(String.format(userSummaryUrl, steamId), UserSummary.class);
    }

    @Override
    public CompletableFuture<UserSummary> getUserSummaryAsync() {
        return CompletableFuture.supplyAsync(this::getUserSummary);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof AbstractSteamUser)
            return this.steamId.equals(((AbstractSteamUser)o).getSteamId());

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s", this.steamId);
    }
}
