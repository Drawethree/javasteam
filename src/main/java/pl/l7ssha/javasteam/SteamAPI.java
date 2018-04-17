package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 31 Mar 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.utils.ResponserUtils;

public class SteamAPI {
    public SteamAPI(final String key) {
        ResponserUtils.setToken(key);
    }

    public static boolean initialize(final String key) {
        ResponserUtils.setToken(key);
        return true;
    }

    /**
     * Provides access to CSGO-specific endpoints. No marketplace included.
     * @return CsgoService
     */
    public CsgoService getCsgoService() {
        return new CsgoService();
    }

    /**
     * Provides access to user-related endpoints of steam API.
     * @return SteamService
     */
    public SteamUserService getSteamUserService() {
        return new SteamUserService();
    }

    /**
     * Provides access to endpoints which relates to steam store
     * @return StoreFrontService
     */
    public StoreFrontService getStoreFront() {
        return new StoreFrontService();
    }


    /**
     * Provides ability to resolve steamID based on nick or name
     * @return VanityUrlResolver
     */
    public VanityUrlResolver getVanityUrlResolver() {
        return new VanityUrlResolver();
    }

    /**
     * Provides ability to acces steam stats services.
     * @return SteamStatsService
     */
    public SteamStatsService getStatService() {
        return new SteamStatsService();
    }
}
