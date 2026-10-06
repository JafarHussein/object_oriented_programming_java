package OverloadedConstructors;

public class User {

    String userName;
    String email;
    int age;


    User(String userName){
        this.userName=userName;
        this.email="Not provided";
        this.age=0;
    }

    User(String userName, String email){
        this.userName="Not provided";
        this.email=email;
        this.age=0;
    }

    User(String userName, String email, int age){
        this.userName="Not provided";
        this.email="Not needed";
        this.age=age;
    }

    User(){
        this.userName="guest";
        this.email="Not provided";
        this.age=0;
    }
    
}
