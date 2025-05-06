import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String src = sc.nextLine();
        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();

        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
