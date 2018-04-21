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

    /**
     * Initialize a SteamAPI with key. This can be achieved also by constructor
     * @param key Steam API key
     * @return Returns true if api initialized properly
     */
    public static boolean initialize(final String key) {
        ResponserUtils.setToken(key);
        return true;
    }

    /**
     * Returns service instance
     * @param service ISteamService class
     * @param <T> ISteamService class
     * @return ISteamService
     */
    public <T extends ISteamService> T getService(Class<T> service) {
        try {
            return service.newInstance();
        } catch(InstantiationException | IllegalAccessException e) {
           throw new RuntimeException(e);
        }
    }
}
