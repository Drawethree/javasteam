package pl.l7ssha.javasteam.marketplace.ingame.iteminfo;

// pl.l7ssha.javasteam.marketplace.ingame.iteminfo
//
// Date created: 27 Apr 2018
// Author: Szymon 'l7ssha' Uglis


public class InGameItemDescription {
    private String type;
    private String value;
    private String appData;

    public InGameItemDescription(String type, String value, String appData) {
        this.type = type;
        this.value = value;
        this.appData = appData;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String getAppData() {
        return appData;
    }
}
