package Lec_13_July_28_Synchronization;

class BookingSystem{
    int TicketsLeft;

    public BookingSystem(int TicketsLeft) {
        this.TicketsLeft = TicketsLeft;
    }
    
    // method synchronization
    // synchronized void bookTcikets(int tickets){
    //     System.out.println("Tickets left : " + TicketsLeft);
    //     if(tickets > TicketsLeft){
    //         System.out.println("Only " + TicketsLeft + " tickets are left");
    //         return;
    //     }
    //     TicketsLeft -= tickets;
    //     System.out.println("Succesfully booked Tickets by " + Thread.currentThread().getName() +", Left : " + TicketsLeft);
    // }

    void bookTcikets(int tickets){
        System.out.println("Tickets left : " + TicketsLeft);
        if(tickets > TicketsLeft){
            System.out.println("Only " + TicketsLeft + " tickets are left");
            return;
        }
        // block synchronization
        synchronized (this) {
            TicketsLeft -= tickets;
            System.out.println("Succesfully booked Tickets by " + Thread.currentThread().getName() +", Left : " + TicketsLeft);
        }
    }
}

public class synchronization {
    public static void main(String[] args) {
        
        BookingSystem bs = new BookingSystem(8);

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            
            for(int i=0 ; i<3 ; i++){
                bs.bookTcikets(2);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException ex) {
                }
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");

            for(int i=0 ; i<3 ; i++){
                bs.bookTcikets(3);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
            }
        });

        t1.start();
        t2.start();
    }
}
