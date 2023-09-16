import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
// display original values
        System.out.print("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
// count, min, max, sum and average of the values
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n",
                IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n",
                IntStream.of(values).max().getAsInt());

        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        System.out.printf("Average: %.2f%n",
                IntStream.of(values).average().getAsDouble());
// sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y));
// sum of squares of values with reduce method
        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y * y));
        // product of values with reduce method
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(1, (x, y) -> x * y));
    }
}