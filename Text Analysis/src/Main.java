import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Text: ");
        String text = input.nextLine().toLowerCase();
        int []letterCount=new int[26];
        for(int i=0;i<text.length();i++)
        {
            char current = text.charAt(i);
            if(current >='a' && current <= 'z')
            {
                letterCount[current-'a']++;
            }
        }
        for(char l ='a';l<='z';l++)
        {
            int count=letterCount[l-'a'];
            if(count > 0)
                System.out.println(l+" : "+count);
        }
    }
}