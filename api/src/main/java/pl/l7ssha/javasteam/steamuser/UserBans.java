package pl.l7ssha.javasteam.steamuser;

// pl.l7ssha.javasteam.steamuser.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.Userable;
import pl.l7ssha.javasteam.steamuser.SteamUser;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class UserBans implements Userable {
    private Long SteamId;
    private String CommunityBanned;
    private Boolean VACBanned;
    private Long NumberOfVACBans;
    private Long DaysSinceLastBan;
    private Long NumberOfGameBans;
    private String EconomyBan;

    public UserBans() { }

    public Date DaysSinceLastBanAsDate() {
        LocalDate banDay = LocalDate.now().minusDays(NumberOfGameBans);
        return Date.from(banDay.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public String getCommunityBanned() {
        return CommunityBanned;
    }

    public Boolean getVACBanned() {
        return VACBanned;
    }

    public Long getNumberOfVACBans() {
        return NumberOfVACBans;
    }

    public Long getDaysSinceLastBan() {
        return DaysSinceLastBan;
    }

    public Long getNumberOfGameBans() {
        return NumberOfGameBans;
    }

    public String getEconomyBan() {
        return EconomyBan;
    }

    @Override
    public ISteamUser getSteamUser() {
        return new SteamUser(SteamId);
    }
}
