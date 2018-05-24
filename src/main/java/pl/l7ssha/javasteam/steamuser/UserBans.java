package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class UserBans implements Userable {

    @SerializedName("SteamId")
    private Long steamId;

    @SerializedName("CommunityBanned")
    private String communityBanned;

    @SerializedName("VACBanned")
    private Boolean VACBanned;

    @SerializedName("NumberOfVACBans")
    private Long numberOfVACBans;

    @SerializedName("DaysSinceLastBan")
    private Long daysSinceLastBan;

    @SerializedName("NumberOfGameBans")
    private Long numberOfGameBans;

    @SerializedName("EconomyBan")
    private String economyBan;

    public UserBans() { }

    public Date DaysSinceLastBanAsDate() {
        LocalDate banDay = LocalDate.now().minusDays(numberOfGameBans);
        return Date.from(banDay.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * String representing if user is community banned
     * @return Community banned status
     */
    public String getCommunityBanned() {
        return communityBanned;
    }

    /**
     * True if account is VAC banned.
     * @return Boolean. True if banned
     */
    public Boolean getVACBanned() {
        return VACBanned;
    }

    /**
     * Number of VAC bans 'abstained' by user
     * @return Count of VAC bans
     */
    public Long getNumberOfVACBans() {
        return numberOfVACBans;
    }

    /**
     * Count of days since last ban
     * @return Number of days
     */
    public Long getDaysSinceLastBan() {
        return daysSinceLastBan;
    }

    /**
     * Number of total game bans
     * @return Number of bans
     */
    public Long getNumberOfGameBans() {
        return numberOfGameBans;
    }

    /**
     * String representing if user is economy banned
     * @return Economy banned status
     */
    public String getEconomyBan() {
        return economyBan;
    }

    @Override
    public ISteamUser getSteamUser() {
        return new SteamUser(steamId);
    }
}
