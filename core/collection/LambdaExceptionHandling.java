package core.collection;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class LambdaExceptionHandling {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("1","2","Three","4");

//        listString.stream()
//                .map(s->{
//                        try {
//                            return Integer.parseInt(s);
//                        }catch (NumberFormatException ne){
//                            System.err.println(ne);
//                            return 0;// Default value when an exception occurred..
//
//    //                        or
////                            throw  new RuntimeException("Invalid Format Exception "+ne);
//
//                        }
//                })
//                .forEach(System.out::println);


//        listString.stream().map(HandleException(s->Integer.parseInt(s))).forEach(System.out::println);


        listString.stream().map(s->toInt(s).orElse(0)).forEach(System.out::println);
    }

    public static <T,R>Function<T,R> HandleException(Function<T,R> function){
        return t->{
            try {
            return  function.apply(t);
            }catch (Exception e){
                System.err.println("Exception Details "+e.getMessage());
                return  null;
            }
        };
    }
    public static Optional<Integer> toInt(String s){
        try {
            return Optional.of(Integer.parseInt(s));
        }catch (NumberFormatException ne){
            return Optional.empty();
        }



    }

}
