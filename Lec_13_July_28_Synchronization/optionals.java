package Lec_13_July_28_Synchronization;

import java.util.Optional;

public class optionals {
    public static void main(String[] args) {
        
        String[] words = new String[5];

        if(words[1] != null){
            
            words[1].charAt(2); // words[1] is null

        }
        Optional<String> word = Optional.ofNullable(words[1]);
        if(word.isPresent()){
            words[1].charAt(2);
        }
    }
}
