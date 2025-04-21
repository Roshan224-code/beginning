import java.util.Scanner;

public class digitseparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        String number = scanner.next(); // take input as a string

        System.out.println("Individual digits of the number:");

        // Print each character
        for (int i = 0; i < number.length(); i++) {
            System.out.println(number.charAt(i));
        }

        scanner.close();
    }
}
