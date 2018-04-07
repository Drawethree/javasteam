package pl.l7ssha.javasteam.storefront.models.news;

import com.google.gson.*;
import pl.l7ssha.javasteam.utils.Utils;

import java.lang.reflect.Type;
import java.util.Date;

// pl.l7ssha.javasteam.storefront.models.news
//
// Date created: 03 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class NewsItemDeserializer implements JsonDeserializer<NewsItem> {
    @Override
    public NewsItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();

        long gid = obj.get("gid").getAsLong();
        String title = obj.get("title").getAsString();
        String url = obj.get("url").getAsString();
        boolean isExternal = obj.get("is_external_url").getAsBoolean();
        String author = obj.get("author").getAsString();
        String contents = obj.get("contents").getAsString();
        String feedlabel = obj.get("feedlabel").getAsString();
        Date date = Utils.timestampToDate(obj.get("date").getAsLong());
        String feedname = obj.get("feedname").getAsString();
        int feedType = obj.get("feed_type").getAsInt();

        return new NewsItem(gid, title, url, isExternal, author, contents, feedlabel, feedname, feedType, date);
    }
}
