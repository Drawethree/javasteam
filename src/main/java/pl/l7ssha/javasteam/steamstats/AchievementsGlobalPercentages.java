package pl.l7ssha.javasteam.steamstats;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

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
