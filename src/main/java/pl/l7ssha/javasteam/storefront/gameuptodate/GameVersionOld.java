package pl.l7ssha.javasteam.storefront.gameuptodate;

import com.google.gson.annotations.SerializedName;

// pl.l7ssha.javasteam.storefront.gameuptodate
//
// Date created: 10 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class GameVersionOld implements IGameVersion {

    @SerializedName("up_to_date")
    boolean upToDate;

    @SerializedName("version_is_listable")
    boolean versionIsListable;

    @SerializedName("required_version")
    String requiredVersion;

    String message;

    @Override
    public boolean isUpToDate() {
        return upToDate;
    }

    @Override
    public String getMessage() {
       return message;
    }

    public boolean isVersionIsListable() {
        return versionIsListable;
    }

    public String getRequiredVersion() {
        return requiredVersion;
    }
}
