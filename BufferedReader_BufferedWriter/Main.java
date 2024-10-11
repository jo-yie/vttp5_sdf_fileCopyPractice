package BufferedReader_BufferedWriter;

import java.io.*;

public class Main { 

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("joyie.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy of joyie.txt"));

        String line; 

        while ((line = br.readLine()) != null) {
            bw.write(line); 
            bw.newLine();
        }

        br.close(); 
        bw.close(); 

    }
    

}