package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.steamuser.ISteamUser;
import pl.l7ssha.javasteam.steamuser.NamedSteamUser;
import pl.l7ssha.javasteam.steamuser.SteamUser;
import pl.l7ssha.javasteam.steamuser.groups.GroupInfo;
import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.ResponserUtils;

import java.util.concurrent.CompletableFuture;

public class SteamUserService implements ISteamService{
    /**
     * Returns user with specified steamid.
     * @param steamid ID of user in 32-bit interger format
     * @return ISteamUser
     */
    public ISteamUser getSteamUser(Long steamid) {
        return new SteamUser(steamid);
    }

    /**
     *  Returns user with specified nick. Constructor blocks thread! If you have user id, use version of method with id.
     * @param nick Nick of user
     * @return ISteamUser
     */
    public ISteamUser getSteamUser(String nick) {
        return new NamedSteamUser(nick);
    }

    /**
     * Returns info of specified group
     * @param groupId Id of group
     * @return GroupInfo
     */
    public GroupInfo getGroupInfo(Long groupId) {
        return ResponserUtils.getXMLResponse(String.format(Links.groupInfoXMLUrl, groupId), GroupInfo.class);
    }

    /**
     * Asynchronously returns info of specified group
     * @param groupId Id of group
     * @return GroupInfo
     */
    public CompletableFuture<GroupInfo> getGroupsInfoAsync(Long groupId) {
        return CompletableFuture.supplyAsync(() -> getGroupInfo(groupId));
    }
}
