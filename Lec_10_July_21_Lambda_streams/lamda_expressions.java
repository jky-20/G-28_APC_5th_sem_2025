package Lec_10_July_21_Lambda_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

interface FunctionalInterface{
    int operation(int a, int b);   // abstract method
}

public class lamda_expressions {
    public static void main(String[] args) {
        
        // Anonymous class (having no class name)
        FunctionalInterface anonymous = new FunctionalInterface() {
            public int operation(int a, int b){
                return a + b;
            }
        };

        // using objects of anonymous class
        int ans = anonymous.operation(10, 20);

        // Lambda expressions instead of anonymous class
        FunctionalInterface mul = (a,b) -> a*b;
        mul.operation(10, 2);

        // Write Lambda expression for Divide
        FunctionalInterface divide = (a,b) ->{
            if(b == 0){
                return Integer.MAX_VALUE;
            }
            return a / b;
        };

        // Lambda Expressions instead of comparator / comparable
        List<String> names = Arrays.asList("abc", "dfgh","ert","sdyhu");

        Collections.sort(names, (a,b) -> a.compareTo(b));   // increasing order
        Collections.sort(names, (a,b) -> b.compareTo(a));   // reverse order

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();  // increasing order sorted
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b, a));
    }
}
