package Lec_07_July_14_JCF;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionFramework {
    public static void main(String[] args) {
        
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(11);
        hashSet.add(20);
        System.out.println("HashSet : ");
        for(int element : hashSet){
            System.out.println(element);
        }
        
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(11);
        
        System.out.println("LinkedSet : ");
        for(int element : linkedSet){
            System.out.println(element);
        }

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(11);
        System.out.println("TreeSet : ");
        for(int element : treeSet){
            System.out.println(element);
        }

        // set methods
        hashSet.contains(20);    // checks if element is present or not
        hashSet.size();
        hashSet.toArray();  // return Object array not primitive array
        hashSet.clear();
    }
}
