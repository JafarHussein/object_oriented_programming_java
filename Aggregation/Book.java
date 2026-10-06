package Aggregation;

public class Book {

    String title;
    String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    void  displayInfo(){

        System.out.printf("%s by %s",this.title, this.author);
    }
    
}
