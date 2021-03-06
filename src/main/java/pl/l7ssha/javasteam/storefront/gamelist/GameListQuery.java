package pl.l7ssha.javasteam.storefront.gamelist;

import pl.l7ssha.javasteam.utils.Links;

// pl.l7ssha.javasteam.storefront.models.gamelist
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

public class GameListQuery {
    private long if_modified_since = 0;
    private String have_description = "";

    private boolean include_games = true;
    private boolean include_dlc = false;
    private boolean include_software = false;
    private boolean include_videos = false;
    private boolean include_hardware = false;

    private int max = 10_000;

    private long appid = 0;

    /**
     * Time whan game was modified last time
     * @param value Time as unix timestamp
     * @return This
     */
    public GameListQuery setModifiedSince(long value) {
        this.if_modified_since = value;
        return this;
    }

    /**
     * Checks if app has description in specified language.
     * @param lang Language as eg. ENG, PL. Full names not tested
     * @return This
     */
    public GameListQuery setHaveDescInLanguage(String lang) {
        this.have_description = lang;
        return this;
    }

    public GameListQuery setIncludeGames(boolean include_games) {
        this.include_games = include_games;
        return this;
    }

    public GameListQuery setIncludeDlc(boolean include_dlc) {
        this.include_dlc = include_dlc;
        return this;
    }

    public GameListQuery setIncludeSoftware(boolean include_software) {
        this.include_software = include_software;
        return this;
    }

    public GameListQuery setIncludeVideos(boolean include_videos) {
        this.include_videos = include_videos;
        return this;
    }

    public GameListQuery setIncludeHardware(boolean include_hardware) {
        this.include_hardware = include_hardware;
        return this;
    }

    /**
     * Max number of apps included in response
     * @param max Default 10k
     * @return This
     */
    public GameListQuery setMaxResults(int max) {
        this.max = max;
        return this;
    }

    /**
     * Set if want start searching from specified game
     * @param appid Game id
     * @return This
     */
    public GameListQuery setAppid(long appid) {
        this.appid = appid;
        return this;
    }

    @Override
    public String toString() {
        return String.format(Links.storeSearching, if_modified_since, have_description, boolToInt(include_games),
                boolToInt(include_dlc), boolToInt(include_hardware), boolToInt(include_software),
                boolToInt(include_videos), appid, max);
    }

    private int boolToInt(boolean b) {
        return b? 1 : 0;
    }
}
