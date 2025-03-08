package number.programs;

public class RecursiveProgram {
    public static void main(String[] args) {

        System.out.println(sumNumber(10));
    }
    public  static int sumNumber(int x){
        if(x<=0)
            return 0;
        return  x+sumNumber(x-1);
    }
}
