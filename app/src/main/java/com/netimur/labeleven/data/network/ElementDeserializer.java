package com.netimur.labeleven.data.network;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.netimur.labeleven.domain.entity.Element;

import java.lang.reflect.Type;

class ElementDeserializer implements JsonDeserializer<Element> {

    @Override
    public Element deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();
        String type = obj.get("type").getAsString();
        return new Element(obj.get("code").getAsInt(), obj.get("name").getAsString(), obj.get("isBase").getAsBoolean());
    }
}
