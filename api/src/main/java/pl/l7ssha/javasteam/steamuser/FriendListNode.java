package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import java.util.Date;

public class FriendListNode implements Userable {
    private Long steamId;
    private String relationship;
    private Date friendSince;

    public FriendListNode(Long steamId, String relationship, Date friendSince) {
        this.steamId = steamId;
        this.relationship = relationship;
        this.friendSince = friendSince;
    }

    @Override
    public ISteamUser getSteamUser() {
        return new SteamUser(steamId);
    }

    public Long getSteamId() {
        return steamId;
    }

    public String getRelationship() {
        return relationship;
    }

    public Date getFriendSince() {
        return friendSince;
    }
}
