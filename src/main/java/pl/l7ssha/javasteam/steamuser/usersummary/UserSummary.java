package pl.l7ssha.javasteam.steamuser.usersummary;

// pl.l7ssha.javasteam.steamuser.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.steamuser.*;
import pl.l7ssha.javasteam.utils.annotation.Nullable;

import java.util.Date;

public class UserSummary implements Userable {
    private Long steamid;
    private ProfileVisibilityState profileVisibilityState;
    private PersonaState personaState;
    private boolean profileState;
    private String nick;
    private Date lastLogOff;
    private boolean commentPermission;
    private String profileUrl;
    private String avatar;
    private String avatarMedium;
    private String avatarFull;
    private String realname;
    private Long primaryClanId;
    private Date timeCreated;
    private int personaStateFlags;
    private String countryCode;

    @Nullable
    private String gameExtraInfo;

    @Nullable
    private Long gameId;

    public UserSummary(Long steamid, ProfileVisibilityState profileVisibilityState, PersonaState personaState, boolean profileState, String nick, Date lastLogOff, boolean commentPermission, String profileUrl, String avatar, String avatarMedium, String avatarFull, String realname, Long primaryClanId, Date timeCreated, int personaStateFlags, String countryCode, String gameExtraInfo, Long gameId) {
        this.steamid = steamid;
        this.profileVisibilityState = profileVisibilityState;
        this.personaState = personaState;
        this.profileState = profileState;
        this.nick = nick;
        this.lastLogOff = lastLogOff;
        this.commentPermission = commentPermission;
        this.profileUrl = profileUrl;
        this.avatar = avatar;
        this.avatarMedium = avatarMedium;
        this.avatarFull = avatarFull;
        this.realname = realname;
        this.primaryClanId = primaryClanId;
        this.timeCreated = timeCreated;
        this.personaStateFlags = personaStateFlags;
        this.countryCode = countryCode;
        this.gameExtraInfo = gameExtraInfo;
        this.gameId = gameId;
    }

    public UserSummary() { }

    public Long getSteamid() {
        return steamid;
    }

    public ProfileVisibilityState getProfileVisibilityState() {
        return profileVisibilityState;
    }

    public PersonaState getPersonaState() {
        return personaState;
    }

    public boolean isProfileState() {
        return profileState;
    }

    public String getNick() {
        return nick;
    }

    public Date getLastLogOff() {
        return lastLogOff;
    }

    public boolean isCommentPermission() {
        return commentPermission;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarMedium() {
        return avatarMedium;
    }

    public String getAvatarFull() {
        return avatarFull;
    }

    public String getRealname() {
        return realname;
    }

    public Long getPrimaryClanId() {
        return primaryClanId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public int getPersonaStateFlags() {
        return personaStateFlags;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public ISteamUser getSteamUser() {
       return new SteamUser(steamid);
    }
}
