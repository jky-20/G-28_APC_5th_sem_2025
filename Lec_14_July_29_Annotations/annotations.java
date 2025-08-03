package Lec_14_July_29_Annotations;

// @Deprecated

import java.util.Scanner;

class parent{
    // @Deprecated // method is old or not in use
    @SuppressWarnings("unused")
    void print(){
        System.out.println("Parent class");
    }
}

@SuppressWarnings("unused")
class child extends parent{
    @Override   // annotation
    void print(){
        System.out.println("Child class");
    }
}

public class annotations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    }
}
