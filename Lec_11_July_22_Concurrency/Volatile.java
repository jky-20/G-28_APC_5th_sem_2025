package Lec_11_July_22_Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Volatile {
    // no storage to cache memory of threads
    // updation done only on original location
    volatile int num = 10;
    void write(int n){
        num = n;
    }
    int read(){
        return num;
    }
    public static void main(String[] args){
        // int b = 10;
        AtomicInteger a = new AtomicInteger(10);
        a.incrementAndGet();    // no access to other threads ultil value is updated
    }
}
