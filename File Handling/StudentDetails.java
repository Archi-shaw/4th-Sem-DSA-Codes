import java.io.*;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Enter file name: ");
            String filename = sc.nextLine();
            
            FileWriter fw = new FileWriter(filename);
            fw.write(roll + "\n" + name + "\n" + subject + "\n" + marks);
            fw.close();
            System.out.println("Data saved successfully!");

            System.out.println("\nReading Data from File...");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }

        sc.close();
    }
}
