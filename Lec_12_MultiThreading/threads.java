package Lec_12_MultiThreading;

// creating threads using Thread class
class Game extends Thread{
    public void run(){
        // includes tasks to perform
        System.out.println("Inside Thread : " + Thread.currentThread().getName());
        System.out.println("Woohhhoooo");
    }
}

// creating using Runnable interface
class Game2 implements Runnable{
    public void run(){
        System.out.println("Inside Thread : " + Thread.currentThread().getName());
    }
}

public class threads {
    public static void main(String[] args) {
        
        Game game = new Game();
        // game.run(); // normal function calling inside same Thread
        game.start();   // creates new Thread and calls run() internally

        // creating thread by runnable
        Thread t1 = new Thread(new Game2());
        t1.start();

        // using Lambda expression
        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("Lambda-Thread");
            System.out.println("Thread name : " + Thread.currentThread().getName());
        });
        t2.start();
    }
}
