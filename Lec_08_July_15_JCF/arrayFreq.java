package Lec_08_July_15_JCF;

import java.util.HashMap;
import java.util.Scanner;

public class arrayFreq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int val : arr){
            hmap.put(val, hmap.getOrDefault(val, 0) + 1);
        }
        for(var entry : hmap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i=0 ; i<m ; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // count pairs sum to target
        int cnt = 0;
        for(int val : nums){
            cnt += hmap.getOrDefault(target - val, 0);
        }
    }
}
