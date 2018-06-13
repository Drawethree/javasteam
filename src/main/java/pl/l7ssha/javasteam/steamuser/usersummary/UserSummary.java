package pl.l7ssha.javasteam.steamuser.usersummary;

// pl.l7ssha.javasteam.steamuser.models
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;
import pl.l7ssha.javasteam.steamuser.Userable;
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

    public UserSummary() {}

    /**
     * Id of steam user
     * @return 64-bit id
     */
    public Long getSteamid() {
        return steamid;
    }

    /**
     * Visibility state of user's account
     * @return Enum
     */
    public ProfileVisibilityState getProfileVisibilityState() {
        return profileVisibilityState;
    }

    /**
     * Status of user (eg. ONLINE, PLAYING, LOOKING FOR TRADE)
     * @return Enum
     */
    public PersonaState getPersonaState() {
        return personaState;
    }

    /**
     * Idicates if profile has personaState
     * @return Boolean
     */
    public boolean isProfileState() {
        return profileState;
    }

    /**
     * User's public nick
     * @return String with nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * Last logoff date
     * @return Date of last logoff
     */
    public Date getLastLogOff() {
        return lastLogOff;
    }

    /**
     * Indicates if commenting under user's profile is allowed
     * @return Boolean. True if can comment
     */
    public boolean isCommentPermission() {
        return commentPermission;
    }

    /**
     * Profile url
     * @return String with profile url
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Url to profile avatar
     * @return Url as String
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Url to profile medium avatar
     * @return url as Stirng
     */
    public String getAvatarMedium() {
        return avatarMedium;
    }

    /**
     * Url to profile full avatar
     * @return url as Stirng
     */
    public String getAvatarFull() {
        return avatarFull;
    }

    /**
     * Real name if set
     * @return String with name
     */
    public String getRealname() {
        return realname;
    }

    /**
     * Id of primary group
     * @return 64bit id
     */
    public Long getPrimaryClanId() {
        return primaryClanId;
    }

    /**
     * Time when steam account was created
     * @return Account creation date
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Undocumented
     * @return Int
     */
    public int getPersonaStateFlags() {
        return personaStateFlags;
    }

    /**
     * String country code (eg. PL, US, GER)
     * @return Contry code as String
     */
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public ISteamUser getSteamUser() {
        return new SteamUser(steamid);
    }
}
