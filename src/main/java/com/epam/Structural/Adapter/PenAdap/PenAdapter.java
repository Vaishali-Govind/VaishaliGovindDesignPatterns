package com.epam.Structural.Adapter.PenAdap;

import com.epam.Structural.Adapter.PenType.PilotPen;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
          pp.mark(str);
    }
}
