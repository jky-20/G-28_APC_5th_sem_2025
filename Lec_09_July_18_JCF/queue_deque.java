package Lec_09_July_18_JCF;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queue_deque {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // min-Heap

        pq.add(20);
        pq.add(12);
        pq.add(23);
        pq.add(10);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> list = new LinkedList<>();

        deque.add(10);  // -> 10
        deque.addFirst(20); // -> 20,10
        deque.addLast(15);  // -> 20,10,15

        deque.removeFirst();
        deque.removeLast();
        deque.size();
        deque.remove();

        // list methods
        list.addFirst(10);
        list.addLast(20);
        // same as dequeue
    }
}
