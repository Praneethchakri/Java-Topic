package core.collection;

public class StringToUpperAndLower {
    public static void main(String[] args) {
        String name = "DiguvapalemPraneethChakravarthi";
        int stringLength = name.length();
        int splitStringValue =  stringLength/2;
        String firstHalf = name.substring(0,splitStringValue);
        String secondHalf = name.substring(splitStringValue/*-1),stringLength*/);
        System.out.println("String Coversion "+firstHalf.toUpperCase()+" "+secondHalf.toLowerCase());
        System.out.println(firstHalf.length() +" "+secondHalf.length());
    }
}
