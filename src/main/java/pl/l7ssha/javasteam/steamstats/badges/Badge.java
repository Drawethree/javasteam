package pl.l7ssha.javasteam.steamstats.badges;

// pl.l7ssha.javasteam.steamstats.badges
//
// Date created: 09 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.Date;

public abstract class Badge {
    protected int badgeId;
    protected int level;
    protected Date completionTime;
    protected int xp;
    protected int scarcity;

    protected Badge(int badgeId, int level, Date completionTime, int xp, int scarcity) {
        this.badgeId = badgeId;
        this.level = level;
        this.completionTime = completionTime;
        this.xp = xp;
        this.scarcity = scarcity;
    }

    /**
     * Id of badge
     * @return Id as number
     */
    public int getBadgeId() {
        return badgeId;
    }

    /**
     * Level of badge
     * @return Badge level as number
     */
    public int getLevel() {
        return level;
    }

    /**
     * Date when badge was completed,
     * @return Date
     */
    public Date getCompletionTime() {
        return completionTime;
    }

    /**
     * Get actual xp amount
     * @return Xp as number
     */
    public int getXp() {
        return xp;
    }

    public int getScarcity() {
        return scarcity;
    }
}
