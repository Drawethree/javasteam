package pl.l7ssha.javasteam.steamuser.groups;

// pl.l7ssha.javasteam.steamuser.groups
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "groupDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupDetails {
    @XmlElement(name = "groupName")
    private String name;

    @XmlElement(name = "groupURL")
    private String groupUrl;

    @XmlElement(name = "headline")
    private String headline;

    @XmlElement(name = "summary")
    private String summary;

    @XmlElement(name = "avatarIcon")
    private String avatarIcon;

    @XmlElement(name = "avatarMedium")
    private String avatarMedium;

    @XmlElement(name = "avatarFull")
    private String avatarFull;

    @XmlElement(name = "memberCount")
    private int memberCount;

    @XmlElement(name = "membersInChat")
    private int membersInChat;

    @XmlElement(name = "membersInGame")
    private int membersInGame;

    @XmlElement(name = "membersOnline")
    private int membersOnline;

    public GroupDetails() { }

    /**
     * Public name of group
     * @return Group name as String
     */
    public String getName() {
        return name;
    }

    /**
     * Group Url (In many cases it's only name of group)
     * @return String
     */
    public String getGroupUrl() {
        return groupUrl;
    }

    /**
     * UNDOCUMENTED (Name of group but uppercase (?))
     * @return
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Short group description
     * @return Group description as String
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Url to group's avatar
     * @return Url as String
     */
    public String getAvatarIcon() {
        return avatarIcon;
    }

    /**
     * Url to group's medium avatar
     * @return Url as String
     */
    public String getAvatarMedium() {
        return avatarMedium;
    }

    /**
     * Url to group's big avatar
     * @return Url as String
     */
    public String getAvatarFull() {
        return avatarFull;
    }

    /**
     * Number of members in group
     * @return Number of group members
     */
    public int getMemberCount() {
        return memberCount;
    }

    /**
     * Number of members in group chat
     * @return Number of members in group chat
     */
    public int getMembersInChat() {
        return membersInChat;
    }

    /**
     * Number of members in game
     * @return Number of members igame
     */
    public int getMembersInGame() {
        return membersInGame;
    }

    /**
     * Number of currently online members
     * @return Number of currently online members
     */
    public int getMembersOnline() {
        return membersOnline;
    }
}
