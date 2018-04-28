package pl.l7ssha.javasteam.schema;

// pl.l7ssha.javasteam.schema
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class SchemaAchievement {
    private String name;

    @SerializedName("defaultvalue")
    private int defaultValue;

    private String displayName;

    private int hidden;
    private String description;
    private String icon;

    @SerializedName("icongray")
    private String iconGray;

    public SchemaAchievement() { }

    public String getName() {
        return name;
    }

    public int getDefaultValue() {
        return defaultValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getHidden() {
        return hidden;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public String getIconGray() {
        return iconGray;
    }
}
