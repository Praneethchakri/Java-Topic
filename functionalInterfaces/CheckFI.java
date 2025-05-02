package functionalInterface.programs;

import java.util.concurrent.atomic.AtomicInteger;

public class CheckFI {

    public static void test(CustomerFunctionalInterface cfi){
        cfi.apply();

    }
    public static void main(String[] args) {
        AtomicInteger count= new AtomicInteger(10);
        new CheckFI().test(()-> System.out.println("LambdaCheck With Customer FI"+ count.getAndIncrement()));
    }
}
