package com.vk.api.sdk.objects.messages;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class ButtonAction {

    @SerializedName("type")
    private String type = "text";

    @SerializedName("payload")
    private String payload;

    @SerializedName("label")
    private String label;

    public ButtonAction() {
    }

    public ButtonAction(String type, String payload, String label) {
        this.type = type;
        this.payload = payload;
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ButtonAction that = (ButtonAction) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(payload, that.payload) &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, payload, label);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ButtonAction{");
        sb.append("type='").append(type).append('\'');
        sb.append(", payload='").append(payload).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
