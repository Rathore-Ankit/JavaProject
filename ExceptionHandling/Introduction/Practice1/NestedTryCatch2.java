package Introduction.Practice1;

import java.io.*;
import java.util.Arrays;

public class NestedTryCatch2 {

    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line = br.readLine();
            while (line != null) {
                processFileREcords(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processFileREcords(String line) {
        try {
            System.out.println(Arrays.stream(line.split("\\s")).toList().get(1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }


}

//note
/*is code ka use ham try catch ke andar loop lagane ke liye karte hai jab haume file se data padhna ho
us case me (jab ek line ke aage ka word using indexing) padhna ho tab ham is approach ka use karte hai*/