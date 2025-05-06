import java.util.HashMap;
import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Occurrences:");
        for (int key : freqMap.keySet()) {
            System.out.println("Occurrence of " + key + " = " + freqMap.get(key));
        }
        sc.close();
    }
}
