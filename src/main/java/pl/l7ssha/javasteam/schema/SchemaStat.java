package pl.l7ssha.javasteam.schema;

// pl.l7ssha.javasteam.schema
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

public class SchemaStat {
    private String name;

    @SerializedName("defaultValue")
    private int defaultValue;

    private String displayName;

    public SchemaStat() { }

    public String getName() {
        return name;
    }

    public int getDefaultValue() {
        return defaultValue;
    }

    public String getDisplayName() {
        return displayName;
    }
}
