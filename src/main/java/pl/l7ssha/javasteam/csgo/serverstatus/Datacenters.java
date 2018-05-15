package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class Datacenters {
    private Centre peru;

    @SerializedName("EU West")
    private Centre euWest;

    @SerializedName("EU East")
    private Centre euEast;

    private Centre poland;

    @SerializedName("India East")
    private Centre indiaEast;

    @SerializedName("Hong Kong")
    private Centre hongKong;

    private Centre spain;
    private Centre chile;

    @SerializedName("US Southwest")
    private Centre usSounthWest;

    @SerializedName("US Southeast")
    private Centre usSouthEast;

    private Centre india;

    @SerializedName("EU North")
    private Centre euNorth;

    private Centre emirates;

    @SerializedName("US Northwest")
    private Centre usNorthWest;

    @SerializedName("South Africa")
    private Centre southAfrica;

    private Centre brazil;

    @SerializedName("US Northeast")
    private Centre usNorthEast;

    @SerializedName("US Northcentral")
    private Centre usNorthCentral;

    private Centre japan;
    private Centre singapore;
    private Centre australia;

    @SerializedName("China Shanghai")
    private Centre chinaShanghai;

    @SerializedName("China Tianjin")
    private Centre chinaTianjin;

    @SerializedName("China Guangzhou")
    private Centre chinaGuangzhou;

    public Datacenters() { }

    public Centre getPeru() {
        return peru;
    }

    public Centre getEuWest() {
        return euWest;
    }

    public Centre getEuEast() {
        return euEast;
    }

    public Centre getPoland() {
        return poland;
    }

    public Centre getIndiaEast() {
        return indiaEast;
    }

    public Centre getHongKong() {
        return hongKong;
    }

    public Centre getSpain() {
        return spain;
    }

    public Centre getChile() {
        return chile;
    }

    public Centre getUsSounthWest() {
        return usSounthWest;
    }

    public Centre getUsSouthEast() {
        return usSouthEast;
    }

    public Centre getIndia() {
        return india;
    }

    public Centre getEuNorth() {
        return euNorth;
    }

    public Centre getEmirates() {
        return emirates;
    }

    public Centre getUsNorthWest() {
        return usNorthWest;
    }

    public Centre getSouthAfrica() {
        return southAfrica;
    }

    public Centre getBrazil() {
        return brazil;
    }

    public Centre getUsNorthEast() {
        return usNorthEast;
    }

    public Centre getUsNorthCentral() {
        return usNorthCentral;
    }

    public Centre getJapan() {
        return japan;
    }

    public Centre getSingapore() {
        return singapore;
    }

    public Centre getAustralia() {
        return australia;
    }

    public Centre getChinaShanghai() {
        return chinaShanghai;
    }

    public Centre getChinaTianjin() {
        return chinaTianjin;
    }

    public Centre getChinaGuangzhou() {
        return chinaGuangzhou;
    }
}
