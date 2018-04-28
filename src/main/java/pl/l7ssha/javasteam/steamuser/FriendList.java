package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 24 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.List;

public class FriendList {
    private List<FriendListNode> friends;

    public FriendList(List<FriendListNode> friends) {
        this.friends = friends;
    }

    public List<FriendListNode> getFriends() {
        return friends;
    }
}
