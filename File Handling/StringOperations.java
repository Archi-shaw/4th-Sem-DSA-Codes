import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String changedCase = changeCase(str);
        System.out.println("Changed Case: " + changedCase);
        
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
        
        System.out.print("Enter second string for comparison: ");
        String str2 = sc.nextLine();
        int diff = str.compareTo(str2);
        System.out.println("Difference in ASCII values: " + diff);

        System.out.print("Enter a string to insert: ");
        String insertStr = sc.nextLine();
        System.out.println("String after insertion: " + str + " " + insertStr);
        
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        System.out.print("Enter a character to find its position: ");
        char ch = sc.next().charAt(0);
        int pos = str.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of '" + ch + "' is: " + pos);
        else
            System.out.println("Character not found!");

        if (str.equalsIgnoreCase(reversed))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");

        countWordsVowelsConsonants(str);

        sc.close();
    }

    static String changeCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }

    static void countWordsVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        String words[] = s.split("\\s+");

        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
