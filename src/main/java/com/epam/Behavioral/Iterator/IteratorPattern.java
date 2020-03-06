package com.epam.Behavioral.Iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        CollectionOfNames compRepository = new CollectionOfNames();

        for(Iterator iter = compRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
