package com.epam.Creational.Factory.phone;

public class OSFactory {

    public OS getInstance(String str){
        if(str.equalsIgnoreCase("open"))
            return new Android();

        else if(str.equalsIgnoreCase("close"))
            return new IOS();
        else
            return new Windows();
    }
}
