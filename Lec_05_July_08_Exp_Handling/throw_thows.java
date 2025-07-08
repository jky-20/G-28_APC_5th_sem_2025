package Lec_05_July_08_Exp_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_thows {

    static void OutOfBoundException(){
        int[] arr = new int[2];
        System.out.println(arr[8]);
        throw new ArrayIndexOutOfBoundsException();
    }
    static void CanThrowException() throws FileNotFoundException{
        // try{        
            FileReader fr = new FileReader("Example.txt");
        // }
        // catch(FileNotFoundException e){
        //     throw e;
        // }
    }
    public static void main(String[] args){

        // Checked exception  - Gives error during compilation
        FileReader fr = new FileReader("Example.txt");

        int[] arr = new int[4];
        // unchecked exception
        int a = arr[7];

        try {
            CanThrowException();
        } catch (FileNotFoundException e) {
            System.out.println("Handled");
        }
    }
}
