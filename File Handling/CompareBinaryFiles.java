import java.io.*;

public class CompareBinaryFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("file1.bin");
        FileInputStream f2 = new FileInputStream("file2.bin");

        int b1, b2, pos = 0;
        boolean areEqual = true;

        while ((b1 = f1.read()) != -1 && (b2 = f2.read()) != -1) {
            pos++;
            if (b1 != b2) {
                areEqual = false;
                System.out.println("Files are different at byte position: " + pos);
                break;
            }
        }

        if (areEqual)
            System.out.println("Two files are equal");

        f1.close();
        f2.close();
    }
}
