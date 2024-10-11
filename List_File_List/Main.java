package List_File_List;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException { 

        String[] hearMeOuts = {"william dafoe", "jk simmons", "david attenbourgh"};

        BufferedWriter bw = new BufferedWriter(new FileWriter("HMO.txt"));

        for (String s : hearMeOuts) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();

    }

}
