package pl.l7ssha.javasteam.steamstats.globalachievements;

import pl.l7ssha.javasteam.utils.annotation.Nullable;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class StatAchievement {
    private String name;
    private double percent;

    @Nullable
    private String description;

    public StatAchievement(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    public StatAchievement setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public double getPercent() {
        return percent;
    }

    public String getDescription() {
        return description;
    }
}
