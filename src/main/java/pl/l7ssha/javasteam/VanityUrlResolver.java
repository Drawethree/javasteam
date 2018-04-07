package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.utils.Links;
import pl.l7ssha.javasteam.utils.ResponserUtils;
import pl.l7ssha.javasteam.vanity.VanityUrl;
import pl.l7ssha.javasteam.vanity.VanityUrlType;

import java.util.concurrent.CompletableFuture;

public class VanityUrlResolver {
    VanityUrlResolver() { }

    public VanityUrl resolve(String phrase, VanityUrlType type) {
        return (VanityUrl)ResponserUtils.getResponse(String.format(Links.vanityUrl, phrase, type.getValue()), VanityUrl.class);
    }

    public CompletableFuture<VanityUrl> resolveAsync(String phrase, VanityUrlType type) {
        return CompletableFuture.supplyAsync(() -> resolve(phrase, type));
    }
}
