package Lec_05_July_08_Exp_Handling;

import java.util.Scanner;

public class expHandling {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(a / b);  // raises the exception (/ by zero)

        try {
            System.out.println(a / b);
            try {
                int[] arr = new int[2];
                System.out.println(arr[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic exception");
        }
        catch (Exception e) {
            System.out.println("Can't divide by zero, try another divisor");
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("hello all !!!!!!!!");
        }

        System.out.println("Today is 8th July");
    }
}
