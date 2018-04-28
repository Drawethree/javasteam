package pl.l7ssha.javasteam.steamuser;

import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.vanity.VanityUrl;
import pl.l7ssha.javasteam.vanity.VanityUrlType;

import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

// Constructor can be dangerous (eg. cant find user)
public class NamedSteamUser extends AbstractSteamUser {
    private String nick;

    public NamedSteamUser(String nick) {
       super((getGenericResponse(String.format(Links.vanityUrl, nick, VanityUrlType.PROFILE.getValue()), VanityUrl.class)).getSteamId());
       this.nick = nick;
    }

    public Long getSteamId() {
        return steamId;
    }

    public String getNick() {
        return nick;
    }
}
