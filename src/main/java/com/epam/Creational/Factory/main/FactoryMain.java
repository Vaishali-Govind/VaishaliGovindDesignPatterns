package com.epam.Creational.Factory.main;

import com.epam.Creational.Factory.phone.*;

public class FactoryMain {
    public static void main(String[] args) {


        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("open");
        obj.spec();
    }
}
