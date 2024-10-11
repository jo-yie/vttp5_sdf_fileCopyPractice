package List_File_List;

import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<String> receive = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("HMO.txt"));

        String line;

        while ((line = br.readLine()) != null) { 
            receive.add(line);
        }

        br.close();

        for (String s : receive) {
            System.out.println(s);
        }

    }
    
}
