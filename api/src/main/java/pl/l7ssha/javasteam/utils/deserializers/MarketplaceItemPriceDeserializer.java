package pl.l7ssha.javasteam.utils.deserializers;

// pl.l7ssha.javasteam.marketplace.itemprice
//
// Date created: 18 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.*;
import pl.l7ssha.javasteam.marketplace.itemprice.MarketplaceItemPrice;

import java.lang.reflect.Type;

public class MarketplaceItemPriceDeserializer implements JsonDeserializer<MarketplaceItemPrice> {

    @Override
    public MarketplaceItemPrice deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject base = json.getAsJsonObject();

        double lowest = Double.parseDouble(base.get("lowest_price").getAsString().substring(1));
        int volume = base.get("volume").getAsInt();
        double median = Double.parseDouble(base.get("median_price").getAsString().substring(1));

        return new MarketplaceItemPrice(lowest, volume, median);
    }
}
