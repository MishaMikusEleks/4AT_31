package task.day_4.thread;

public class Main {

    public static void main(String[] args) {
        // Make two threads and connect them to play a Ping-Pong game.
        // One thread should write “ping” to the console, another - “pong”.
        // Each thread should add his own name to his message.
        // It will be good to finish that game after a few seconds.
        // Try to use Executors and different implementation of Thread

        PingPongPlayer pingPongPlayer1=new PingPongPlayer("ping");
        PingPongPlayer pingPongPlayer2=new PingPongPlayer("pong");

        //pingPongPlayer1.setDaemon(true);

        pingPongPlayer1.start();
        pingPongPlayer2.start();


    }
}
