package com.vk.api.sdk.objects.messages;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Keyboard {

    @SerializedName("one_time")
    private boolean oneTime;

    @SerializedName("buttons")
    private List<List<Button>> buttons = new ArrayList<>();

    public Keyboard() {
    }

    public Keyboard(boolean oneTime, List<List<Button>> buttons) {
        this.oneTime = oneTime;
        this.buttons = buttons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Keyboard keyboard = (Keyboard) o;
        return oneTime == keyboard.oneTime &&
                Objects.equals(buttons, keyboard.buttons);
    }

    @Override
    public int hashCode() {

        return Objects.hash(oneTime, buttons);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("oneTime=").append(oneTime);
        sb.append(", buttons=").append(buttons);
        sb.append('}');
        return sb.toString();
    }
}
