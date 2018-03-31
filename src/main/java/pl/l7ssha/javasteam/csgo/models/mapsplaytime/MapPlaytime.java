package pl.l7ssha.javasteam.csgo.models.mapsplaytime;

// pl.l7ssha.javasteam.csgo.models.mapsplaytime
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MapPlaytime {
    @SerializedName("Keys")
    List<String> keys;

    List<Map> playtimes;

    public MapPlaytime() { }

    public MapPlaytime(List<String> keys, List<Map> playtimes) {
        this.keys = keys;
        this.playtimes = playtimes;
    }

    public List<String> getKeys() {
        return keys;
    }

    public List<Map> getPlaytimes() {
        return playtimes;
    }
}
