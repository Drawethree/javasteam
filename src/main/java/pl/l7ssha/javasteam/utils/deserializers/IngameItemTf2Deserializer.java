package pl.l7ssha.javasteam.utils.deserializers;

// pl.l7ssha.javasteam.utils.deserializers
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItem;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItemTf2;
import pl.l7ssha.javasteam.utils.InGameItemsDeserializer;

import java.util.ArrayList;
import java.util.List;

public class IngameItemTf2Deserializer extends InGameItemsDeserializer {
    @Override
    protected InGameItem singleItemPipe(JsonElement element, InGameItem item) {
        JsonObject base = element.getAsJsonObject();

        List<String> tmpTags = new ArrayList<>();

        for(JsonElement e: base.get("tags").getAsJsonArray())
            tmpTags.add(e.getAsString());

        List<Long> tmpTagsIds = new ArrayList<>();

        for(JsonElement e: base.get("tag_ids").getAsJsonArray())
            tmpTagsIds.add(e.getAsLong());

        return new InGameItemTf2(item.getPrice(), item.getName(), item.getDate(), item.getClasses(), item.getClassId(), tmpTags, tmpTagsIds);
    }
}
