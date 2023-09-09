// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static ObjectOutputStream output;
    private static ObjectInputStream input ;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        openFile("oldmast.txt");
        addMasterRecords();
        closeFile();
        openFile("trans.txt");
        addTransactionRecords();
        closeFile();
    }
    public static void openFile(String fileName){
        try{
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        } catch (IOException e) {
            System.err.println("Error opening file");
        }
    }

    public static void addMasterRecords()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%s%n","Enter account number, first name and balance.",
                "Enter EOF to end");
        while (input.hasNext())
        {
            try{
                int accountNumber = input.nextInt();
                String firstName = input.next();
                double balance = input.nextDouble();
                Account record = new Account(accountNumber, firstName ,balance);
                output.writeObject(record);
            } catch (Exception e) {
                System.out.println("cannot find file");
            }
        }
    }
    public static void readMasterRecords(String fileName) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Account record = (Account) input.readObject();
                System.out.println(record.toString());
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading master records from file.");
        }
    }
    public static void readTransactionRecords(String fileName) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                TransactionRecord record = (TransactionRecord) input.readObject();
                System.out.println(record.toString());
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading transaction records from file.");
        }
    }
    public static void addTransactionRecords() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n?%n", "Enter account number and transaction amount",
                "Enter EOF to end");
        while(input.hasNext())
        {
            int accountNumber = input.nextInt();
            double transactionAmount = input.nextDouble();
            TransactionRecord transaction = new TransactionRecord(accountNumber,transactionAmount);
            output.writeObject(transaction);
        }
    }
    public static void closeFile() {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file.");
        }
    }
}