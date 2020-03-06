package com.epam.Creational.Singleton;

import java.text.SimpleDateFormat;

public class JDBCSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.returnName("Vaishali");
    }
}
class Singleton{

    private static final Singleton obj = new Singleton();
    private Singleton(){ }
    public static Singleton getInstance(){
        return obj;
    }
    public void returnName(String str){
        System.out.println("My name is:"+str);
    }

}
