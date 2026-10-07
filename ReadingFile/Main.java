package ReadingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.StructuredTaskScope.FailedException;

public class Main {

    @SuppressWarnings("preview")
    public static void main(String[] args){

        // BufferedReader + FileReader best for reading files line by line
        //FileInputStream Best for binary files
        //RandomAccessFile best for read/write specific portions of a large file


        String filePath="//home//floppy//Documents//test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

        }
        catch(FailedException e){
            System.out.print("We could not locate the file");
        }
    }
    
}
