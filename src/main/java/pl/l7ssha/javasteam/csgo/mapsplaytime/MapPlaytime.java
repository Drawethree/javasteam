package pl.l7ssha.javasteam.csgo.mapsplaytime;

// pl.l7ssha.javasteam.csgo.models.mapsplaytime
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;

public class MapPlaytime implements Iterable<Map> {
    @SerializedName("Keys")
    private List<String> keys;

    private List<Map> playtimes;

    public MapPlaytime() { }

    public MapPlaytime(List<String> keys, List<Map> playtimes) {
        this.keys = keys;
        this.playtimes = playtimes;
    }

    /**
     * By default API returns List of list with order in keys. javasteam parses it already.
     * @return List of keys as Strings
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * By default API returns List of list with order in keys. Parsed from list to object.
     * @return List of maps
     */
    public List<Map> getPlaytimes() {
        return playtimes;
    }

    @Override
    public Iterator<Map> iterator() {
        return playtimes.iterator();
    }
}
