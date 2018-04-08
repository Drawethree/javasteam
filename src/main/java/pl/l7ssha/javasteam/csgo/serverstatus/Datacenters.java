package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;

public class Datacenters {
    private Centre Peru;

    @SerializedName("EU West")
    private Centre EUWest;

    @SerializedName("EU East")
    private Centre EUEast;

    private Centre Poland;

    @SerializedName("India East")
    private Centre IndiaEast;

    @SerializedName("Hong Kong")
    private Centre HongKong;

    private Centre Spain;
    private Centre Chile;

    @SerializedName("US Southwest")
    private Centre USSounthWest;

    @SerializedName("US Southeast")
    private Centre USSouthEast;

    private Centre India;

    @SerializedName("EU North")
    private Centre EUNorth;

    private Centre Emirates;

    @SerializedName("US Northwest")
    private Centre USNorthWest;

    @SerializedName("South Africa")
    private Centre SouthAfrica;

    private Centre Brazil;

    @SerializedName("US Northeast")
    private Centre USNorthEast;

    @SerializedName("US Northcentral")
    private Centre USNorthCentral;

    private Centre Japan;
    private Centre Singapore;
    private Centre Australia;

    @SerializedName("China Shanghai")
    private Centre ChinaShanghai;

    @SerializedName("China Tianjin")
    private Centre ChinaTianjin;

    @SerializedName("China Guangzhou")
    private Centre ChinaGuangzhou;

    public Datacenters() { }

    public Centre getPeru() {
        return Peru;
    }

    public Centre getEu_west() {
        return EUWest;
    }

    public Centre getEUWest() {
        return EUWest;
    }

    public Centre getEUEast() {
        return EUEast;
    }

    public Centre getPoland() {
        return Poland;
    }

    public Centre getIndiaEast() {
        return IndiaEast;
    }

    public Centre getHongKong() {
        return HongKong;
    }

    public Centre getSpain() {
        return Spain;
    }

    public Centre getChile() {
        return Chile;
    }

    public Centre getUSSounthWest() {
        return USSounthWest;
    }

    public Centre getUSSouthEast() {
        return USSouthEast;
    }

    public Centre getIndia() {
        return India;
    }

    public Centre getEUNorth() {
        return EUNorth;
    }

    public Centre getEmirates() {
        return Emirates;
    }

    public Centre getUSNorthWest() {
        return USNorthWest;
    }

    public Centre getSouthAfrica() {
        return SouthAfrica;
    }

    public Centre getBrazil() {
        return Brazil;
    }

    public Centre getUSNorthEast() {
        return USNorthEast;
    }

    public Centre getUSNorthCentral() {
        return USNorthCentral;
    }

    public Centre getJapan() {
        return Japan;
    }

    public Centre getSingapore() {
        return Singapore;
    }

    public Centre getAustralia() {
        return Australia;
    }

    public Centre getChinaShanghai() {
        return ChinaShanghai;
    }

    public Centre getChinaTianjin() {
        return ChinaTianjin;
    }

    public Centre getChinaGuangzhou() {
        return ChinaGuangzhou;
    }
}
