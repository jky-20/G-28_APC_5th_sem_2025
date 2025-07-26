package Lec_10_July_21_Lambda_streams;

import java.util.Arrays;
import java.util.List;

public class java_streams_api {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("abc","abc","acd","a","b");

        // using Streams to filter
        names.stream().filter(n -> n.length()>2).distinct().forEach(n->System.out.println(n));

        // count distinct strings
        int distinct_names = (int)names.stream().distinct().count();
        System.out.println(distinct_names);

        // convert each string having length = 1 to uppercase
        names.stream().filter(n->n.length()==1).map(n->n.toUpperCase()).forEach(n->System.out.println(n));
    }
}
