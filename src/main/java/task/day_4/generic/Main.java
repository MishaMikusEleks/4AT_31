package task.day_4.generic;

import task.day_4.reflection.MyAnyCustomClass;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Generic
//        Make two different comparators for your Custom class
//        (simple java class with few fields). End users should be able to use ‘min’,
//        ‘max’, ‘sotr’ methods with that comparators.
        List<MyAnyCustomClass> list= new ArrayList<>(Arrays.asList(
                new MyAnyCustomClass("asdf",1199),
                new MyAnyCustomClass("sdfsdfd",2),
                new MyAnyCustomClass("sdfsdf",0)
        ));

        System.out.println(list);
        System.out.println(max(list,new PersonComparatorByField2()));

    }

    private static MyAnyCustomClass max(List<MyAnyCustomClass> list, Comparator<MyAnyCustomClass> personComparatorByField2) {
       return Collections.max(list, personComparatorByField2);
    }
}
