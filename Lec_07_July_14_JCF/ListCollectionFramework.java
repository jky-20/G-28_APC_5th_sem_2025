package Lec_07_July_14_JCF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListCollectionFramework {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        String[] strArr = new String[20];

        List<Integer> nums = new ArrayList<>(); // for objects only
        ArrayList<Integer> arrList = new ArrayList<>();

        nums.add(10);
        int a = nums.get(0);
        nums.size();

        Stack<Integer> st = new Stack<>();
        st.add(10); // same as push
        int top = st.peek();    // return top element
        st.push(a); // inserts in stack
        top = st.pop();   // removes and return top from the stack

        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.get(0);
        vec.size();
        vec.remove(0);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(30);   // last of the list
        list.offer(20); // same as add
        list.addFirst(10);  // inserts at the start of the list
        list.get(0);
        list.size();
        list.remove();  // removes from head
        list.removeLast();  // removes from end
        list.peek();    // returns the head of the list
        list.poll();    // removes and returns the top
    }
}
