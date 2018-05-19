package pl.l7ssha.javasteam.csgo.serverstatus;

// pl.l7ssha.javasteam.csgo.models
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Datacenters {
    @SerializedName("Peru")
    private Centre peru;

    @SerializedName("EU West")
    private Centre euWest;

    @SerializedName("EU East")
    private Centre euEast;

    @SerializedName("Poland")
    private Centre poland;

    @SerializedName("India East")
    private Centre indiaEast;

    @SerializedName("Hong Kong")
    private Centre hongKong;

    @SerializedName("Spain")
    private Centre spain;

    @SerializedName("Chile")
    private Centre chile;

    @SerializedName("US Southwest")
    private Centre usSounthWest;

    @SerializedName("US Southeast")
    private Centre usSouthEast;

    @SerializedName("India")
    private Centre india;

    @SerializedName("EU North")
    private Centre euNorth;

    @SerializedName("Emirates")
    private Centre emirates;

    @SerializedName("US Northwest")
    private Centre usNorthWest;

    @SerializedName("South Africa")
    private Centre southAfrica;

    @SerializedName("Brazil")
    private Centre brazil;

    @SerializedName("US Northeast")
    private Centre usNorthEast;

    @SerializedName("US Northcentral")
    private Centre usNorthCentral;

    @SerializedName("Japan")
    private Centre japan;

    @SerializedName("Singapore")
    private Centre singapore;

    @SerializedName("Australia")
    private Centre australia;

    @SerializedName("China Shanghai")
    private Centre chinaShanghai;

    @SerializedName("China Tianjin")
    private Centre chinaTianjin;

    @SerializedName("China Guangzhou")
    private Centre chinaGuangzhou;

    public Datacenters() { }

    /**
     * Returns All Datacenters as Map with qualified names same as in endpoint
     * @return Map<String, Centre>
     */
    public Map<String, Centre> getCentersAsMap() {
        return new HashMap<String, Centre>() {{
           put("Peru", peru);
           put("EU West", euWest);
           put("EU East", euEast);
           put("Poland", poland);
           put("India East", indiaEast);
           put("Hong Kong", hongKong);
           put("Spain", spain);
           put("Chile", chile);
           put("US Southwest", usSounthWest);
           put("US Southeast", usSouthEast);
           put("India", india);
           put("EU North", euNorth);
           put("Emirates", emirates);
           put("US Northwest", usNorthWest);
           put("South Africa", southAfrica);
           put("Brazil", brazil);
           put("US Northeast", usNorthEast);
           put("US NorthCentral", usNorthCentral);
           put("Japan", japan);
           put("Singapore", singapore);
           put("Australia", australia);
           put("China Shanghai", chinaShanghai);
           put("China Tianjin", chinaTianjin);
           put("China Guangzhou", chinaGuangzhou);
        }};
    }

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
