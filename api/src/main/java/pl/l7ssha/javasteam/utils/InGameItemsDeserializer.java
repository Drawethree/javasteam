package pl.l7ssha.javasteam.utils;

// pl.l7ssha.javasteam
//
// Date created: 25 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.*;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItem;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItemClass;
import pl.l7ssha.javasteam.marketplace.ingame.InGameItems;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class InGameItemsDeserializer implements JsonDeserializer<InGameItems> {

    public String getDateFormat(String date) {
        if(date.contains("-"))
            return "YYYY-MM-dd";

        return "YYYY/MM/dd";
    }

    @Override
    public InGameItems deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray array = json.getAsJsonObject().get("result").getAsJsonObject().get("assets").getAsJsonArray();

        List<InGameItem> tmp = new ArrayList<>();

        for(JsonElement e : array)
            tmp.add(singleItemPipe(e, getItem(e)));

        return new InGameItems(tmp);
    }

    protected InGameItem singleItemPipe(JsonElement element, InGameItem item) {
        return item;
    }

    protected InGameItem getItem(JsonElement element) {
        JsonObject base = element.getAsJsonObject();

        int price = base.get("prices").getAsJsonObject().get("USD").getAsInt();
        String name = base.get("name").getAsString();

        Date date = null;

        try {
            String tmp = base.get("date").getAsString();
            date = new SimpleDateFormat(getDateFormat(tmp), Locale.ENGLISH).parse(tmp);
        } catch(ParseException e) {
            e.printStackTrace();
        }

        List<InGameItemClass> tmpClasses = new ArrayList<>();

        for(JsonElement e: base.get("class").getAsJsonArray()) {
            JsonObject baseClass = e.getAsJsonObject();

            String nameClass = baseClass.get("name").getAsString();
            int value = baseClass.get("value").getAsInt();

            tmpClasses.add(new InGameItemClass(nameClass, value));
        }

        long classid = base.get("classid").getAsLong();

        return new InGameItem(price, name, date, tmpClasses, classid);
    }
}
