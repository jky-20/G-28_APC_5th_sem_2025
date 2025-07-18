package Lec_09_July_18_JCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class G_28 implements Comparable<G_28>{
    String name;
    int marks;
    int rollNo;

    public G_28(String name, int marks, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }
    // @Override
    public int compareTo(G_28 other){
        return Integer.compare(this.rollNo, other.rollNo);
    }
}

class sortByMarks implements Comparator<G_28>{
    public int compare(G_28 s1, G_28 s2){
        return Integer.compare(s2.marks, s1.marks); // reverse order
    }
}

public class comparable {
    public static void main(String[] args) {
        
        G_28 s1 = new G_28("Jai", 4, 1234);
        G_28 s2 = new G_28("ABC", 5, 124);
        G_28 s3 = new G_28("DEF", 6, 122334);

        List<G_28> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);

        // comparator
        Collections.sort(students, new sortByMarks());
    }
}
