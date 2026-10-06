package Aggregation;

public class Main {

    public static void main(String[] args){
        Book book1 = new Book("Harry potter and the Philosopher stonde","J.K.Rowling");
        Book book2 = new Book("Hunter","James Mwangi");

        book1.displayInfo();
        book2.displayInfo();

        Book[] books = {book1, book2};

        Library library = new Library("Kenya National Library", 2001, books);
    }
    
}
