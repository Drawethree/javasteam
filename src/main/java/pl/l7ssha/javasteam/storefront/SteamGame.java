package pl.l7ssha.javasteam.storefront;

// pl.l7ssha.javasteam.storefront
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import com.google.gson.annotations.SerializedName;
import pl.l7ssha.javasteam.storefront.models.news.News;
import pl.l7ssha.javasteam.storefront.models.steamgame.CurrentPlayers;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.currentPlayersUrl;
import static pl.l7ssha.javasteam.utils.Links.newsForApp;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getResponse;

public class SteamGame {
    protected String name;

    @SerializedName("steam_appid")
    protected long appId;

    public SteamGame() { }

    public String getName() {
        return name;
    }

    public long getAppId() {
        return appId;
    }

    public News getNews(int count) {
        return (News) getResponse(String.format(newsForApp, appId, count), News.class);
    }

    public CompletableFuture<News> getNewsAsync(String id, int count) {
        return CompletableFuture.supplyAsync(() -> getNews(count));
    }

    public CurrentPlayers getCurrentPlayers() {
        return (CurrentPlayers) getResponse(String.format(currentPlayersUrl, appId), CurrentPlayers.class);
    }

    public CompletableFuture<CurrentPlayers> getCurrentPlayersAsync() {
        return CompletableFuture.supplyAsync(this::getCurrentPlayers);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof SteamGame)
            return this.getAppId() == ((SteamGame)o).getAppId();

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", this.appId, this.name);
    }
}
