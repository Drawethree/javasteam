package pl.l7ssha.javasteam.utils.deserializers;

// pl.l7ssha.javasteam.storefront
//
// Date created: 02 Apr 2018
// Author: Szymon 'l7ssha' Uglis

import com.google.gson.*;
import pl.l7ssha.javasteam.storefront.StorePackage;

import java.lang.reflect.Type;

import static pl.l7ssha.javasteam.utils.Utils.deserializeObjectWithCancer;

public class StorePackageDeserializer implements JsonDeserializer<StorePackage> {

    @Override
    public StorePackage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement firstData = deserializeObjectWithCancer(json);

        return new Gson().fromJson(firstData, StorePackage.class);
    }
}
