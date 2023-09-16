import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence. This is a SAMPLE sentence!";
        Map<String , Integer> wordCountMap = new HashMap<>();
        String cleanedSentence = sentence.replaceAll("[^a-zA-z]","").toLowerCase();
        String[] words = cleanedSentence.split(" ");
        for(String word : words)
        {
                if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Duplicate words and their counts:");
        for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

