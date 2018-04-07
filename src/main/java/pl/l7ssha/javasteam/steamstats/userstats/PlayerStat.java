package pl.l7ssha.javasteam.steamstats.userstats;

import pl.l7ssha.javasteam.utils.annotation.Nullable;

// pl.l7ssha.javasteam.steamstats.userstats
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class PlayerStat {
    private String name;
    private int value;

    private String description;

    public PlayerStat() { }

    public PlayerStat setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Nullable
    public String getDescription() {
        return description;
    }
}
