package pl.l7ssha.javasteam.csgo.mapsplaytime;

// pl.l7ssha.javasteam.csgo.models.mapsplaytime
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

public class Map {
    private Long intervalStartTimeStamp;
    private String mapName;
    private Double RelativePercentage;

    public Map(Long intervalStartTimeStamp, String mapName, Double relativePercentage) {
        this.intervalStartTimeStamp = intervalStartTimeStamp;
        this.mapName = mapName;
        RelativePercentage = relativePercentage;
    }

    public Map() { }

    /**
     * Undocumented by Steam
     * @return Integer
     */
    public Long getIntervalStartTimeStamp() {
        return intervalStartTimeStamp;
    }

    /**
     * Name of map
     * @return String containing name
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * Total playtime percentage.
     * @return Percentage in double value
     */
    public Double getRelativePercentage() {
        return RelativePercentage;
    }
}
