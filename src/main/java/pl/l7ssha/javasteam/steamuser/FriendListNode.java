package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

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

    /**
     * User steamId
     * @return 64bit id
     */
    public Long getSteamId() {
        return steamId;
    }

    /**
     * Relationship of friend to user
     * @return Relationship string
     */
    public String getRelationship() {
        return relationship;
    }

    public Date getFriendSince() {
        return friendSince;
    }
}
