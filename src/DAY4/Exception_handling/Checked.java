package DAY4.Exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 1.Checked Exception Example

// IO EXCEPTION
// File not Exception

public class Checked {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("file.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
    
}
