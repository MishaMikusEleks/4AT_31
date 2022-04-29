package task.day_3.exception;

public class DivByZeroException extends Exception{

    public DivByZeroException(String message) {
        super(message);
        System.out.println("DivByZeroException created");
    }

}
