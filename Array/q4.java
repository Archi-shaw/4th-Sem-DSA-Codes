import java.util.Scanner;

class ObjectCounter {
    static int count = 0; 

    ObjectCounter() {
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of objects to create: ");
        int n = sc.nextInt();

        ObjectCounter[] objects = new ObjectCounter[n];
        for (int i = 0; i < n; i++) {
            objects[i] = new ObjectCounter();
        }
        System.out.println("Number of objects created: " + ObjectCounter.count);

        sc.close();
    }
}
