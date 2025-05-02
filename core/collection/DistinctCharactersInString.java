package core.collection;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharactersInString {
    public static void main(String[] args) {
        String str = "Praneeth Charkvarthi Diguvapalem";

//        char []c = str.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for(int i =0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c != ' '){
                characterSet.add(c);
            }
        }
        for(Character c :characterSet){
            System.out.print(" "+c);
        }

    }
}
