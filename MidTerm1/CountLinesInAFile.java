import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesInAFile {
    static int CountLinesInFile (String filename) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }

    public static void main(String[] args)
    {
        String filename = "C:\\Users\\Bayu\\Desktop\\test.txt";
        System.out.println("The number of lines in the file is " + CountLinesInFile(filename));
    }
}
