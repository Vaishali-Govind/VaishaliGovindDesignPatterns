package com.epam.Structural.Adapter.PenAdap;

import com.epam.Structural.Adapter.PenType.PilotPen;

public class School {
    public static void main(String[] args) {
        Pen p =  new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("i am an adapter");
    }
}
