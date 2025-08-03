package Lec_14_July_29_Annotations;

class A{
    int a;
}

class B{
    A obj;

    // constructor type
    B(A obj){
        this.obj = obj;
    }

    // setter type
    void setter(A obj){
        this.obj = obj;
    }
}

public class dependencyInjection {
    public static void main(String[] args) {
        
    }
}
