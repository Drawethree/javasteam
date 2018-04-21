package pl.l7ssha.javasteam.storefront.gameuptodate;

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.utils.annotation.Nullable;

// pl.l7ssha.javasteam.storefront.gameuptodate
//
// Date created: 10 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class GameVersionNew implements IGameVersion {

    @SerializedName("up_to_date")
    boolean upToDate;

    @SerializedName("version_is_listable")
    boolean versionIsListable;

    public GameVersionNew() { }

    @Override
    public boolean isUpToDate() {
       return upToDate;
    }

    public boolean isVersionIsListable() {
        return versionIsListable;
    }

    @Override
    @Nullable
    public String getMessage() {
        return null;
    }
}
