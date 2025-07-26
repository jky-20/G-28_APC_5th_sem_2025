package Lec_12_MultiThreading;

public class threadMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread Game = new Thread(() -> {
            Thread.currentThread().setName("Gaming");
            System.out.println("Wooohooooo");
            for(int i=0 ; i<5 ; i++){
                System.out.println("Majjaa aa rha hai bhaii !!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
            System.out.println("Attendence ka Time ho gya");
        });
        Game.start();

        Game.wait();
        Game.notify();
        Game.interrupt();

        System.out.println("Class chal rhi hai");
        System.out.println("Sir Multithreading padha rhe hai ");
        System.out.println("Sir ne Multithreading padha di");

        // waits for Game to complete its task
        Game.join();
        
        System.out.println("Attendence ho gyi");
        System.out.println("Absent lagg gyi");
        System.out.println("Sir chale gye");

    }
}
