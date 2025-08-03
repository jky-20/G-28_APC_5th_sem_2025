package Lec_14_July_29_Annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambdaQuestion {
    public static void main(String[] args) {
        
        int[][] arr = new int[10][4];

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> list = new ArrayList<>();
        Collections.sort(list, (a, b) -> {
            if (!a.get(1).equals(b.get(1))) 
                return Integer.compare(a.get(1), b.get(1));
            if (!a.get(2).equals(b.get(2))) 
                return Integer.compare(a.get(2), b.get(2));
            if (!a.get(3).equals(b.get(3))) 
                return Integer.compare(a.get(3), b.get(3));
            return Integer.compare(a.get(0), b.get(0));
        });

    }
}
