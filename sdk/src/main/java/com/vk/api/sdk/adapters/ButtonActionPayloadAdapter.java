package com.vk.api.sdk.adapters;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vk.api.sdk.objects.messages.ButtonActionPayload;

public class ButtonActionPayloadAdapter extends TypeAdapter<ButtonActionPayload> {

    private final Gson gson = new Gson();

    @Override
    public void write(JsonWriter writer, ButtonActionPayload value) throws IOException {
        writer.jsonValue(gson.toJson(value));
    }

    @Override
    public ButtonActionPayload read(JsonReader in) throws IOException {
        return null;
    }
}
