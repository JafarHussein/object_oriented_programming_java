package Static;

public class Friend {


    static int numFriends=0;


    String name;

    Friend(String name){
        this.name=name;
        numFriends+=1;
    }
    
}
