package Lec_12_MultiThreading;

public class multithreading {
    public static void main(String[] args) {
        
        Thread Game = new Thread(() -> {
            Thread.currentThread().setName("Gaming");
            System.out.println("Wooohooooo");
            for(int i=0 ; i<10 ; i++){
                System.out.println("Majjaa aa rha hai bhaii !!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        });

        Thread Class = new Thread(() -> {
            Thread.currentThread().setName("Class");
            for(int i=0 ; i<10 ; i++){
                System.out.println("Bhai ye kya Topic chal rha hai !!!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
            }
        });

        Game.start();
        Class.start();
    }
}
