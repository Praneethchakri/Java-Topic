package core.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSorting {

    public static void main(String[] args) {

        List<User> user = new ArrayList<>();


        user.add(new User(1,"Praneeth","India",LocalDateTime.of(1991,10,06,02,10)));
        user.add(new User(2,"Diguvapalem","Germany",LocalDateTime.of(1990,8,06,02,10)));
        user.add(new User(3,"Chakravarthi","USA",LocalDateTime.of(1989,5,11,02,10)));
        user.add(new User(4,"Sushma","Germany",LocalDateTime.of(1993,5,27,02,10)));

        System.out.println("User Sorted Natural Sorting order Before" +user);
        Collections.sort(user);
        System.out.println("\n");
        System.out.println("User Sorted Natural Sorting order After " +user);



    }
}
