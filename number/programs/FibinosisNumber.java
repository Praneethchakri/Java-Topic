package number.programs;

public class FibinosisNumber {
    public static void main(String[] args) {

        int firstNum=0,secondNum=1;
        int n = 10;
        for(int i=0;i<n;i++){
            System.out.print(firstNum+" ");
            int nextNum = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
