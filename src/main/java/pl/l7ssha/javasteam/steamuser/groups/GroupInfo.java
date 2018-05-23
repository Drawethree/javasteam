package pl.l7ssha.javasteam.steamuser.groups;

// pl.l7ssha.javasteam.steamuser.groups
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
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

    /**
     * Id of group
     * @return 64-bit id
     */
    public long getGroupId() {
        return groupId;
    }

    /**
     * Details of group
     * @return Object with group details
     */
    public GroupDetails getDetails() {
        return details;
    }

    /**
     * Total number of group members
     * @return Number of members
     */
    public int getMemberCount() {
        return memberCount;
    }

    /**
     * List of members is paginated. This is total number of pages
     * @return Number of pages of members list
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * List of members is paginated. This is current page number
     * @return Number of current page
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * List of members is paginated. This index of starting member
     * @return Index of starting member in list.
     */
    public int getStartingMember() {
        return startingMember;
    }

    /**
     * List of members as List of it's ids.
     * @return List of members ids
     */
    public List<Long> getMembersIds() {
        return membersIds;
    }

    /**
     * List of members as List of javasteam's users
     * @return List of Steamuser's
     */
    public List<ISteamUser> getMembers() {
        List<ISteamUser> tmp = new ArrayList<>();

        for(Long id : membersIds)
            tmp.add(new SteamUser(id));

        return tmp;
    }
 }
