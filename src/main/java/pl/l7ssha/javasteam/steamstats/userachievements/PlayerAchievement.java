package pl.l7ssha.javasteam.steamstats.userachievements;

// pl.l7ssha.javasteam.steamstats.userachievements
//
// Date created: 07 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import java.util.Date;

public class PlayerAchievement {
    private String apiName;
    private boolean achieved;
    private Date unlockTime;
    private String name;
    private String description;

    public PlayerAchievement(String apiName, boolean achieved, Date unlockTime, String name, String desciption) {
        this.apiName = apiName;
        this.achieved = achieved;
        this.unlockTime = unlockTime;
        this.name = name;
        this.description = desciption;
    }

    public String getApiName() {
        return apiName;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public Date getUnlockTime() {
        return unlockTime;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
