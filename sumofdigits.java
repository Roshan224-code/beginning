import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter number greater than 10 digits: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Take absolute value to handle negative numbers
        number = Math.abs(number);

        // Loop to extract and sum each digit
        while (number > 0) {
            int digit = number % 10;  // Get last digit
            sum += digit;             // Add it to sum
            number /= 10;             // Remove last digit
        }

        // Print the result
        System.out.println("Sum of digits = " + sum);

        scanner.close();
    }
}
