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

    public String getName() {
        return name;
    }

    public String getGroupUrl() {
        return groupUrl;
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary() {
        return summary;
    }

    public String getAvatarIcon() {
        return avatarIcon;
    }

    public String getAvatarMedium() {
        return avatarMedium;
    }

    public String getAvatarFull() {
        return avatarFull;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public int getMembersInChat() {
        return membersInChat;
    }

    public int getMembersInGame() {
        return membersInGame;
    }

    public int getMembersOnline() {
        return membersOnline;
    }
}
