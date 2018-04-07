package pl.l7ssha.javasteam.storefront.models.gamelist;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.ResponserUtils.getResponse;

// pl.l7ssha.javasteam.storefront.models.gamelist
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class GameList {
    private List<GameListNode> apps;

    @SerializedName("have_more_results")
    private boolean haveMoreResults;

    @SerializedName("last_appid")
    private long lastAppId;

    private GameListQuery query;

    public GameList() { }

    public List<GameListNode> getApps() {
        return apps;
    }

    public boolean isHaveMoreResults() {
        return haveMoreResults;
    }

    public long getLastAppId() {
        return lastAppId;
    }

    public GameList setQuery(GameListQuery query) {
        this.query = query;

        return this;
    }

    public GameList getNext() {
        GameList tmp = (GameList) getResponse(query.setAppid((int)lastAppId).toString(), GameList.class);

        return tmp.setQuery(query);
    }

    public CompletableFuture<GameList> getNextAsync() {
        return CompletableFuture.supplyAsync(() -> {
            GameList tmp = (GameList) getResponse(query.setAppid((int)lastAppId).toString(), GameList.class);

            return tmp.setQuery(query);
        });
    }
}
