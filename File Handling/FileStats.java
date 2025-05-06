import java.io.*;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int chars = 0, words = 0, lines = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();
            words += line.split("\\s+").length;
        }
        
        br.close();
        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
