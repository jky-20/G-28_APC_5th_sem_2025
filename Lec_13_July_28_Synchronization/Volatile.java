package Lec_13_July_28_Synchronization;

class SharedMemory{
    volatile boolean flag = true;
}

class ExampleThread extends Thread{
    
    SharedMemory data;

    ExampleThread(SharedMemory data){
        this.data = data;
    }

    public void run(){
        System.out.println("Example Thread Started");
        while(data.flag){
            // System.out.println("Example Thread is still running");
        }
        System.out.println("Example thread stopped");
    }
}

public class Volatile {
    public static void main(String[] args) throws InterruptedException {
        
        SharedMemory data = new SharedMemory();

        ExampleThread t1 = new ExampleThread(data);
        t1.start();

        Thread.sleep(1000);

        data.flag = false;
        System.out.println("Flag changed to false");
    }
}
