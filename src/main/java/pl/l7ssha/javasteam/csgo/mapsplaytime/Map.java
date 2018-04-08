package pl.l7ssha.javasteam.csgo.mapsplaytime;

// pl.l7ssha.javasteam.csgo.models.mapsplaytime
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

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

    public Long getIntervalStartTimeStamp() {
        return intervalStartTimeStamp;
    }

    public String getMapName() {
        return mapName;
    }

    public Double getRelativePercentage() {
        return RelativePercentage;
    }
}
