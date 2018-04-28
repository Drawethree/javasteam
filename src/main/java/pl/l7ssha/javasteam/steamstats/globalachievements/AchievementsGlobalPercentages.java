package pl.l7ssha.javasteam.steamstats.globalachievements;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import java.util.List;

public class AchievementsGlobalPercentages {
    private List<StatAchievement> achievements;

    public AchievementsGlobalPercentages(List<StatAchievement> achievements) {
        this.achievements = achievements;
    }

    public List<StatAchievement> getAchievements() {
        return achievements;
    }
}
