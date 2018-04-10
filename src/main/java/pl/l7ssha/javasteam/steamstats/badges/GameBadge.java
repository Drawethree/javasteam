package pl.l7ssha.javasteam.steamstats.badges;

import java.util.Date;

// pl.l7ssha.javasteam.steamstats.badges
//
// Date created: 09 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

// Implement ability to cast to SteamGame
public class GameBadge extends Badge {
    private long appId;
    private long communityItemId;
    private int borderColor;

    public GameBadge(int badgeId, int level, Date completionTime, int xp, int scarcity, long appId, long communityItemId, int borderColor) {
        super(badgeId, level, completionTime, xp, scarcity);
        this.appId = appId;
        this.communityItemId = communityItemId;
        this.borderColor = borderColor;
    }

    public long getAppId() {
        return appId;
    }

    public long getCommunityItemId() {
        return communityItemId;
    }

    public int getBorderColor() {
        return borderColor;
    }
}
