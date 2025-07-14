package Lec_06_July_11_File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        
        File file = new File("Lec_06_July_11_File_Handling/example.txt");

        try {
            // create a file
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already Exists");
            }

            // Write a file
            FileWriter fw = new FileWriter(file, true);
            // fw.write("Hello");
            fw.write("Good Morning");
            fw.close();

            // Read a file
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();

            // Buffer reader and Writer
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            BufferedWriter bw = new BufferedWriter(fw);

            br.readLine();
            bw.write("Hello ajsgjhcbsdnmbJSbcDSmnc dsj");

            br.close();
            bw.close();

            // delete a file
            if(file.delete()){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Doesn't exists");
            }

        } catch (IOException e) {
        }
    }
}
