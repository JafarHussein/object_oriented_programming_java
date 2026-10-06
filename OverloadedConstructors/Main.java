package OverloadedConstructors;

public class Main {

    public static void main(String[] args){

        User user1 = new User("Spongebob");
        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);
    }
    
}
