package pl.l7ssha.javasteam.steamuser.groups;

// pl.l7ssha.javasteam.steamuser.groups
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "memberList")
public class GroupInfo {

    @XmlElement(name = "groupID64")
    private long groupId;

    @XmlElement(name = "groupDetails")
    private GroupDetails details;

    @XmlElement(name = "memberCount")
    private int memberCount;

    @XmlElement(name = "totalPages")
    private int totalPages;

    @XmlElement(name = "currentPage")
    private int currentPage;

    @XmlElement(name = "startingMember")
    private int startingMember;

    @XmlElement(name = "steamID64")
    @XmlElementWrapper(name = "members")
    private List<Long> membersIds;

    public GroupInfo() { }

    public long getGroupId() {
        return groupId;
    }

    public GroupDetails getDetails() {
        return details;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getStartingMember() {
        return startingMember;
    }

    public List<Long> getMembersIds() {
        return membersIds;
    }
}
