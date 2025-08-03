package Lec_14_July_29_Annotations;

import java.io.Serializable;

class example implements Serializable{

}

public class markerInterface {
    public static void main(String[] args) {
        
        example obj = new example();

        if(obj instanceof Serializable){
            System.out.println("Can be serialized");
        }
    }
}
