package com.vk.api.sdk.adapters;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.vk.api.sdk.objects.messages.ButtonActionPayload;

public class ButtonActionPayloadAdapter implements JsonSerializer<ButtonActionPayload> {

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(ButtonActionPayload value, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(context.serialize(value).toString());
    }
}
