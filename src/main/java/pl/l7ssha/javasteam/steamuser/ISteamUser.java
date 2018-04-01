package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamuser.models.FriendListNode;
import pl.l7ssha.javasteam.steamuser.models.UserBans;
import pl.l7ssha.javasteam.steamuser.models.usersummary.UserSummary;

import java.util.List;

public interface ISteamUser {
    List<FriendListNode> getFriendList();
    UserBans getUserBans();
    UserSummary getUserSummary();
}
