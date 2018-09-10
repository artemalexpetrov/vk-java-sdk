package com.vk.api.sdk.objects.messages;

import com.vk.api.sdk.queries.EnumParam;

public enum ButtonColor implements EnumParam {

    PRIMARY("primary"),
    DEFAULT("default"),
    NEGATIVE("negative"),
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
