package task.day_4.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
//        Reflection
//        Write a method which can work with any object using reflection.
//        End user should be able use it like this:
//        get(object,”fieldName”) - return value of field
//        put(object,”fieldName”,value) - put the value to field
//        clear(object,”fieldName”) - put null or 0 to the field.
//                Methods should throw exceptions with explanations if something is wrong.

        MyAnyCustomClass myAnyCustomClass=new MyAnyCustomClass("asdf",1199);

        System.out.println(get(myAnyCustomClass,"field1"));
    }

    private static Object get(Object object, String fieldName) {
       Class myClass=object.getClass();
        try {

          Field f=  myClass.getDeclaredField(fieldName);

          f.setAccessible(true);

            return f.get(object);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}
