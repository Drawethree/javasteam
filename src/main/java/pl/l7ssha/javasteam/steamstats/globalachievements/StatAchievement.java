package pl.l7ssha.javasteam.steamstats.globalachievements;

import pl.l7ssha.javasteam.utils.annotation.Nullable;

// pl.l7ssha.javasteam.steamstats
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class StatAchievement {
    private String name;
    private double percent;

    @Nullable
    private String description;

    public StatAchievement(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    void setDescription(String description) {
        this.description = description;
    }

    /**
     * Name of achievement
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Achievement global completion percentages
     * @return Percent as double
     */
    public double getPercent() {
        return percent;
    }

    /**
     * Description of achievement. Can be null if proper methods wasn't called.
     * @return String with description
     */
    @Nullable
    public String getDescription() {
        return description;
    }
}
