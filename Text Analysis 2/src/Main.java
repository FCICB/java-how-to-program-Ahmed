import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] arrayOfStrings = text.split("//s"); // based on white space or taps
        int StringLength;

        if(arrayOfStrings.length > 0)
            StringLength = arrayOfStrings[0].length() + 1;
        else
            StringLength = 0;
        int[] wordLengthCounts = new int[StringLength];

        for(String word : arrayOfStrings) {
            int wordLength = word.length();
            if (wordLength < wordLengthCounts.length) {
                wordLengthCounts[wordLength]++;
            }
        }

        for (int i = 1; i < wordLengthCounts.length; i++) {
            System.out.printf("%d-letter words: %d%n", i, wordLengthCounts[i]);
        }
    }
}