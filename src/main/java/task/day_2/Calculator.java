package task.day_2;

import task.day_3.exception.DivByZeroException;

public class Calculator {

    public static void main(String[] args)  {
        //Task 1. Implement a simple calculator with 4 operations.
        //Each operation - different method.
        //Use it in the main method.

        double a=-2.666;
        double b=10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();
        System.out.println("a+b="+add(a,b));
        System.out.println("a-b="+minus(a,b));
        System.out.println("a*b="+mult(a,b));
        System.out.println("a/b="+divide(a,b));

    }

    public static Double divide(double a, double b){
        if(b==0) try {
            throw new DivByZeroException("invalid dividor "+b);
        } catch (DivByZeroException e) {
            e.printStackTrace();
        }
        return a/b;
    }

    private static double mult(double a, double b) {
        return a*b;
    }

    private static double minus(double a, double b) {
        return a-b;
    }

    public static Double add(double a, double b) {
        return a+b;
    }

}
