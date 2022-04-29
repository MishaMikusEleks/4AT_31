package task.day_4.thread_0;

import java.util.Date;


public class PingPongPlayer extends Thread {

    public static final String[] ball =new String[1];

    private static volatile Integer turnCounter = 0;
    public static final Integer MAX_TURN_COUNT = 100;

    public PingPongPlayer(String name) {
        super(name);
    }

    public void run() {
        System.out.println("player " + getName() + " ready");
        while (turnCounter < MAX_TURN_COUNT) {
            synchronized (ball) {
                play();}
            }
        }

    private void play(){
        if(!getName().equals(ball[0])){
            ball[0] = getName();
            System.out.println(new Date().getTime() + "\t" + ball[0] + "\t" + turnCounter++);
    }
}

}
