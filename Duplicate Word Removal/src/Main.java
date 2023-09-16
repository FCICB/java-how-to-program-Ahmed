import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.toLowerCase().split(" ");
        Set<String> stringSet = new TreeSet<>();
        for(String word : words)
            stringSet.add(word);
        System.out.println("Unique words in alphabetical order:");
        for (String word : stringSet) {
            System.out.println(word);
        }
    }
}