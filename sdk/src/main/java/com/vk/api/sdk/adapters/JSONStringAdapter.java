package com.vk.api.sdk.adapters;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class JSONStringAdapter implements JsonSerializer<Object>, JsonDeserializer<Object> {

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(Object value, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(context.serialize(value).toString());
    }

    @Override
    public Object deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        return gson.fromJson(json.getAsString(), type);
    }

}
