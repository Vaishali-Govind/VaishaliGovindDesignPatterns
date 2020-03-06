package com.epam.Structural.Composite;

import java.util.Random;

public class CompositeTest {

    public static void main(String[] args) {


        Component hd = new Leaf(400, "HDD");
        Component mouse = new Leaf(300, "mouse");
        Component monitor = new Leaf(500, "monitor");
        Component Ram = new Leaf(100, "Ram");
        Component CPU = new Leaf(4000, "CPU");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("mb");
        Composite Computer = new Composite("computer");

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);
        mb.addComponent(CPU);
        mb.addComponent(Ram);
        Computer.addComponent(ph);
        Computer.addComponent(cabinet);

        Computer.showPrice();
    }

}
