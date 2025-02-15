package designPatterns;

import core.collection.User;

public class SingleToneDesignPattern {
    public static void main(String[] args) {

        UserInstance userInstance = UserInstance.getInstance("Praneeth","Germany");
        UserInstance userInstance1 = UserInstance.getInstance("Praneeth","Germany");
        UserInstance userInstance2 = UserInstance.getInstance("Praneeth1","Bangalore");
        System.out.println(userInstance.toString()+" "+userInstance.hashCode());
        System.out.println(userInstance1.toString()+" "+userInstance1.hashCode());
        System.out.println(userInstance2.toString()+" "+userInstance2.hashCode());
    }

}
