import java.util.Scanner;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = in.nextLine();
        String[] tokens = inputLine.split("\\s+");
        TreeSet<String> treeSet = new TreeSet<>();
        for (String token : tokens) {
            treeSet.add(token);
        }
        System.out.println("Tokens in ascending sorted order:");
        for (String token : treeSet) {
            System.out.println(token);
        }
    }
}