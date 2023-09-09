import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Input Phone Number :");
        String phoneNumber=in.nextLine();
        phoneNumber = phoneNumber.replaceAll("[^0-9]","");
        if(phoneNumber.length() != 10)
            System.out.println("Invalid input,try again with this format (555) 555-5555 ");
        else {
            String areaCode=phoneNumber.substring(0,3);
            String firstThreeDigit = phoneNumber.substring(3,6);
            String lastDigits = phoneNumber.substring(6);
            System.out.println("Area code :" + areaCode);
            System.out.println("First three digits :" + firstThreeDigit);
            System.out.println("Last four digits :" + lastDigits);
            System.out.println("Phone Number without formatting : "+areaCode+firstThreeDigit+lastDigits);
        }
    }
}