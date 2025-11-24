package DAY4.Exception_handling;
// Throws
// Used for entire method

import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void readFile() throws IOException {
        FileReader fr =new FileReader("file.txt");

    }
    public static void main(String[] args) {
        try{
            readFile();
        }
        catch(IOException e){
        System.out.println("FIle not found");
    }
    }
    
}
