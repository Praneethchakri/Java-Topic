package programs;

public class StringAppender {

    public static void main(String[] args) {
        stringAdder("Praneeth");
    }

    public static void stringAdder(String name){
        for(char c : name.toCharArray()){
            System.out.print("ex"+c);
        }



    }
}
