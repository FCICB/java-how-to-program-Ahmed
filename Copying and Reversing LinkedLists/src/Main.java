import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Character> originalList = new LinkedList<>();
        for (char i = 'a'; i < 'j'; i++)
            originalList.add(i);
        LinkedList<Character> reversedList = new LinkedList<>();
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Reversed LinkedList: " + reversedList);
    }
}