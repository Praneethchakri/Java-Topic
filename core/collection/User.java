package core.collection;

import java.time.LocalDateTime;

public class User implements Comparable<User>{
    private int userId;
    private String name;
    private String address;
    private LocalDateTime birthYear;


    public User(int userId, String name, String address, LocalDateTime birthYear) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDateTime birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.birthYear.compareTo(o.birthYear);
    }
}
