package com.epam.Behavioral.Iterator;

public class CollectionOfNames implements Container {
    public String[] name ={"Vaishali Govind", "Vishal Govind","Raghu Mehta","Gopal Murthy","Jyothi Vavila"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate() ;
    }
    private class CollectionOfNamesIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            return i < name.length;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}

