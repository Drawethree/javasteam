package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.vanity.VanityUrl;
import pl.l7ssha.javasteam.vanity.VanityUrlType;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.ResponserUtils.getGenericResponse;

public class VanityUrlResolver implements ISteamService {
    /**
     * Resolves literal nick of user or group name to steam 32-bit integer id.
     * @param phrase Phrase to convert
     * @param type Type of phrase to resolve
     * @return VanityUrl
     */
    public VanityUrl resolve(String phrase, VanityUrlType type) {
        return getGenericResponse(String.format(Links.vanityUrl, phrase, type.getValue()), VanityUrl.class);
    }

    /**
     * Asynchronously resolves literal nick of user or group name to steam 32-bit integer id.
     * @param phrase Phrase to convert
     * @param type Type of phrase to resolve
     * @return VanityUrl
     */
    public CompletableFuture<VanityUrl> resolveAsync(String phrase, VanityUrlType type) {
        return CompletableFuture.supplyAsync(() -> resolve(phrase, type));
    }
}
