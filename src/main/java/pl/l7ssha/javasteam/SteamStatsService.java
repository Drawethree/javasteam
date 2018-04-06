package pl.l7ssha.javasteam;

// pl.l7ssha.javasteam
//
// Date created: 06 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author

import pl.l7ssha.javasteam.schema.GameSchema;

import java.util.concurrent.CompletableFuture;

import static pl.l7ssha.javasteam.utils.Links.appSchemaUrl;
import static pl.l7ssha.javasteam.utils.Responser.getResponse;

public class SteamStatsService {
    SteamStatsService() { }

    public GameSchema getSchemaForGame(String id, String lang) {
        return (GameSchema) getResponse(String.format(appSchemaUrl, id, lang), GameSchema.class);
    }

    public CompletableFuture<GameSchema> getSchemaAsync(String id, String lang) {
        return CompletableFuture.supplyAsync(() -> getSchemaForGame(id, lang));
    }
}
