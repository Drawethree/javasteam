package pl.l7ssha.javasteam.storefront.models.news;

import com.google.gson.*;

import java.lang.reflect.Type;

// pl.l7ssha.javasteam.storefront.models.news
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class NewsDeserializer implements JsonDeserializer<News> {
    @Override
    public News deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement base = json.getAsJsonObject().get("appnews");

        return new GsonBuilder().registerTypeAdapter(NewsItem.class, new NewsItemDeserializer()).create().fromJson(base, News.class);
    }
}
