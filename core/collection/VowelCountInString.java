package core.collection;

import java.util.*;

public class VowelCountInString {
    public static void main(String[] args) {

        String name = "PraneethCharkvarthiDiguvapalem";

        Set<Character> ovelDetails = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U','a','e','i','o','u'));
        int vowelCount=0;

        for (int i = 0; i < name.length(); i++) {
            if(ovelDetails.contains(name.charAt(i))){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
        /*for (Character chars :ovelDetails) {
            System.out.println(chars);

        }*/
    }
}
