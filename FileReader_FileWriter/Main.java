package FileReader_FileWriter;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        char[] buffer = new char[1024];
        int size = 0; 

        FileReader r = new FileReader("joyie.txt"); 
        FileWriter w = new FileWriter("copy of joyie.txt"); 

        while ((size = r.read(buffer)) != -1) { 
            w.write(buffer, 0, size); 
        }

        r.close(); 
        w.close(); 

    }

}
