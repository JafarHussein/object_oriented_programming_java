package WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Main {


    public static void main(String[] args){

        // How to write a file using java

        //FileWriter = Good for small or medium sized text files
        //BufferedWriter = Better performance for large amounts of text
        //PrintWriter = Better for structured data
        //FileOutputStream = Best for binary files 

        // lets create a filewrite object in java

        

        try(FileWriter fileWriter = new FileWriter("test.txt")){

            fileWriter.write("I like pizza");

            System.out.println("File has been succefully written");

        }
        catch(FileNotFoundException e){

            System.out.println("Could not locate file location");

        }
        catch(IOException e){

            System.out.println("Could not write the file");

        }


    }
    
}
