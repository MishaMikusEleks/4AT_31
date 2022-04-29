package task.day_3.exception;

import task.day_2.Calculator;

public class MainException {
    public static void main(String[] args) {
        //1) Make your own Exception implementation. Use it in your CalcApp
        System.out.println("a/b="+ Calculator.divide(5,0));
    }
}
