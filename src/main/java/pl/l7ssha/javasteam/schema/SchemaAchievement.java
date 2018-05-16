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

    /**
     * Internal name of achievement
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     * Initial value of achievement
     * @return Integer with default achievement value
     */
    public int getDefaultValue() {
        return defaultValue;
    }

    /**
     * Public, official name of achievement
     * @return String with name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Returns int indicating if achievement is hidden or not.
     * @return Integer. 0 - hidden
     */
    public int getHidden() {
        return hidden;
    }

    /**
     * Secondary description of achievement. Typically contains instructions how to obtains achievement.
     * @return String with description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Link to obtained achievement image.
     * @return String with link
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Link to not yet achieved achievement
     * @return String with href
     */
    public String getIconGray() {
        return iconGray;
    }
}
