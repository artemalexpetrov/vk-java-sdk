package com.vk.api.sdk.objects.messages;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class ButtonActionPayload {

    @SerializedName("command")
    private String command;

    public ButtonActionPayload() {
    }

    public ButtonActionPayload(String command) {
        this.command = command;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ButtonActionPayload that = (ButtonActionPayload) o;
        return Objects.equals(command, that.command);
    }

    @Override
    public int hashCode() {

        return Objects.hash(command);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ButtonActionPayload{");
        sb.append("command='").append(command).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
