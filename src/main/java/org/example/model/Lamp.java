package org.example.model;
import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public int getGlobRating(){
        return globRating;
    }

    public boolean isBattery(){
        return battery;
    }

    public LampType getStyle(){
        return style;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
}
