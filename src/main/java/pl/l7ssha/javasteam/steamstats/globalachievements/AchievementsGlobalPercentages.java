package pl.l7ssha.javasteam.steamstats.globalachievements;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.Iterator;
import java.util.List;

public class AchievementsGlobalPercentages implements Iterable<StatAchievement> {
    private List<StatAchievement> achievements;

    public AchievementsGlobalPercentages(List<StatAchievement> achievements) {
        this.achievements = achievements;
    }

    public List<StatAchievement> getAchievements() {
        return achievements;
    }

    @Override
    public Iterator<StatAchievement> iterator() {
        return achievements.iterator();
    }
}
