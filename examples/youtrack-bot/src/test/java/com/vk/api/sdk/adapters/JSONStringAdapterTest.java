package com.vk.api.sdk.adapters;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.vk.api.sdk.objects.messages.Button;

public class JSONStringAdapterTest {

    @Test
    public void testDeserialize() {
        String json = "{\"action\": { \"type\": \"text\", \"payload\": \"{\\\"command\\\": \\\"1\\\"}\", \"label\": \"Red\"}, \"color\": \"negative\"}";

        Button button = new Gson().fromJson(json, Button.class);
        assertNotNull(button);
        assertEquals(button.getAction().getPayload().getCommand(), "1");
    }
}
