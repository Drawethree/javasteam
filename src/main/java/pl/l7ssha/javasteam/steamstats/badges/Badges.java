package pl.l7ssha.javasteam.steamstats.badges;

import java.util.Iterator;
import java.util.List;

// pl.l7ssha.javasteam.steamstats.badges
//
// Date created: 09 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class Badges implements Iterable<Badge> {
    private List<Badge> badges;

    private int playerXp;
    private int playerLevel;
    private int playerXpToNextLEvel;
    private int playerXpCurrent;

    public Badges(List<Badge> badges, int playerXp, int playerLevel, int playerXpToNextLEvel, int playerXpCurrent) {
        this.badges = badges;
        this.playerXp = playerXp;
        this.playerLevel = playerLevel;
        this.playerXpToNextLEvel = playerXpToNextLEvel;
        this.playerXpCurrent = playerXpCurrent;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public int getPlayerXp() {
        return playerXp;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public int getPlayerXpToNextLEvel() {
        return playerXpToNextLEvel;
    }

    public int getPlayerXpCurrent() {
        return playerXpCurrent;
    }

    @Override
    public Iterator<Badge> iterator() {
        return badges.iterator();
    }
}
