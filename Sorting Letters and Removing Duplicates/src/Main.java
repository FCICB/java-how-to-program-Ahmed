import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            char randomLetter = (char) (random.nextInt(26) + 'a');
            list.add(randomLetter);
        }
        System.out.println("Original List : " + list);
        Collections.sort(list);
        System.out.println("Sorted in Ascending Order: " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + list);
        Set<Character> uniqueSet = new HashSet<>(list);
        List<Character> uniqueList=new ArrayList<>(uniqueSet);
        System.out.println("Unique List (Ascending Order): " + uniqueList);
    }
}