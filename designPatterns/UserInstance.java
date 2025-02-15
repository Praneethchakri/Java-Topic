package designPatterns;

import core.collection.User;

public class UserInstance {
    private String userName;
    private String address;

    private static UserInstance userInstance;

    private UserInstance(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public static UserInstance getInstance(String name,String address){
        if(userInstance==null) {
            userInstance = new UserInstance(name,address);
        }else{
            System.out.println("Object Already created "+userInstance.toString());
        }
        return userInstance;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInstance{" +
                "userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
