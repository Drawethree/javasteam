package pl.l7ssha.javasteam.steamuser;

import pl.l7ssha.javasteam.utils.Links;
import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;
import pl.l7ssha.javasteam.vanity.VanityUrl;
import pl.l7ssha.javasteam.vanity.VanityUrlType;

// pl.l7ssha.javasteam.steamuser
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

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
