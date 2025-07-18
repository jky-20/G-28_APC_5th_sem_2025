package Lec_09_July_18_JCF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");

        Iterator<String> it = list.iterator();
        ListIterator<String> it1 = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        // accessing previous element
        it1.previous();
        it1.previousIndex();
        // it.previous;    // not accessible in iterator
    }
}
