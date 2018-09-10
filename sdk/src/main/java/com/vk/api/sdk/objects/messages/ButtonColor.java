package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ButtonColor implements EnumParam {

    @SerializedName("primary")
    PRIMARY("primary"),

    @SerializedName("default")
    DEFAULT("default"),

    @SerializedName("negative")
    NEGATIVE("negative"),

    @SerializedName("positive")
    POSITIVE("positive");

    private final String value;

    ButtonColor(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
