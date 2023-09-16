import java.util.LinkedList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int incr = random.nextInt(101);
            insertInSortedOrder(linkedList, incr);
        }

        int sum = 0;
        for (Integer number : linkedList) {
            sum += number;
        }

        double average = (double) sum / linkedList.size();

        System.out.println("Sorted LinkedList: " + linkedList);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }

    private static void insertInSortedOrder(LinkedList<Integer> list, int num) {
        {
            int index = 0;
            while (index < list.size() && num > list.get(index)) {
                num++;
            }
            list.add(index, num);
        }
    }
}
