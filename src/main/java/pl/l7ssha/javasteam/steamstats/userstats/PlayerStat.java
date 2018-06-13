package pl.l7ssha.javasteam.steamstats.userstats;

import pl.l7ssha.javasteam.utils.annotation.Nullable;

// pl.l7ssha.javasteam.steamstats.userstats
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class PlayerStat {
    private String name;
    private int value;

    private String description;

    public PlayerStat() {}

    void setDescription(String description) {
        this.description = description;
    }

    /**
     * Internal name of stat
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * value of stat
     * @return Integer
     */
    public int getValue() {
        return value;
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
