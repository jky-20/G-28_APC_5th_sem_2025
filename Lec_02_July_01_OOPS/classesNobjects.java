package Lec_02_July_01_OOPS;

class G_28{
    private char grades;
    static int students_cnt = 0;
    int rollNo;
    String name;

    G_28() {    // parameterized constructor
        students_cnt++;
        name = "abc";
        rollNo = 20;
    }
    // constructor overloading (more than one constructor exists)
    G_28(int roll, String name){    // non-parameterized constructor
        students_cnt++;
        name = name;
        rollNo = roll;
    }
    void example(int a, int b){
    }
}
// basic inheritance
class project extends G_28{
    int project_id;
}
public class classesNobjects {
    public static void main(String[] args) {
        int roll = 123455;
        String name = "Jai";
        String s = new String("Hello");

        G_28 s1 = new G_28();   // creating object of a class
        s1.rollNo = 2590;       // accessing members of a class
        s1.name = "Lovepreet";
        // s1.grades = 'D';

        G_28 s2 = new G_28(986, "Jai");

        System.out.println(s2.students_cnt);    // can do but shouldn't
        System.out.println(G_28.students_cnt);
    }
}
