package com.epam.Structural.Adapter.PenAdap;

public class AssignmentWork {

    private Pen P;

    public void setP(Pen p) {
        P = p;
    }

    public Pen getP() {
        return P;
    }

    public void writeAssignment(String str){
         P.write(str);
    }
}
