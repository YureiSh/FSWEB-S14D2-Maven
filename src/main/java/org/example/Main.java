package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("test",
                new Wall("South"),
                new Wall("North"),
                new Wall("East"),
                new Wall("west"),
                new Ceiling(10, PaintColor.RED),
                new Bed("Lame",1,1,1,1),
                new Lamp(LampType.LAVA, true, 10),
                new Wardrobe(12,10,20.0),
                new Carpet(12,10,PaintColor.RED)
                );
    }
}
