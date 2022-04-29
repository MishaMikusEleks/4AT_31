package task.day_5;

import task.day_4.generic.PersonComparatorByField3;
import task.day_4.reflection.MyAnyCustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(args));
        ////Make simple model
        ////generate some list with those Model objects
        ////use stream with custom comparator
        ////collect it to String list using some field
        List<MyAnyCustomClass> list= new ArrayList<>(Arrays.asList(
                new MyAnyCustomClass("asdf",1199,88),
                new MyAnyCustomClass("55",2,888),
                new MyAnyCustomClass("sdfsdf",0,666)
        ));

        System.out.println(list);
        List<String> resultList= list.stream().sorted(new PersonComparatorByField3())
                .map(MyAnyCustomClass::getField1).collect(Collectors.toList());
        System.out.println(resultList);

        List<String> resultList2= list.stream()
                .sorted(Comparator.comparing(MyAnyCustomClass::getField1))
                .map(MyAnyCustomClass::getField1).collect(Collectors.toList());
        System.out.println(resultList2);
    }
}
