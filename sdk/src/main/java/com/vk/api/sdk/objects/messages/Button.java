package com.vk.api.sdk.objects.messages;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Button {

    @SerializedName("action")
    private ButtonAction action;

    @SerializedName("color")
    private ButtonColor buttonColor;

    public Button() {
    }

    public Button(ButtonAction action, ButtonColor buttonColor) {
        this.action = action;
        this.buttonColor = buttonColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Button button = (Button) o;
        return Objects.equals(action, button.action) &&
                buttonColor == button.buttonColor;
    }

    @Override
    public int hashCode() {

        return Objects.hash(action, buttonColor);
    }

    public ButtonAction getAction() {
        return action;
    }

    public ButtonColor getButtonColor() {
        return buttonColor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Button{");
        sb.append("action=").append(action);
        sb.append(", buttonColor=").append(buttonColor);
        sb.append('}');
        return sb.toString();
    }
}
