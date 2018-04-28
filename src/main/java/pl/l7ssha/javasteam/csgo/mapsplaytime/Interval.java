package pl.l7ssha.javasteam.csgo.mapsplaytime;

import com.google.gson.annotations.SerializedName;

// pl.l7ssha.javasteam.csgo.models.mapsplaytime
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public enum Interval {
    @SerializedName("day")
    DAY,
    @SerializedName("week")
    WEEK,
    @SerializedName("month")
    MONTH
}
