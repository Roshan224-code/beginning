import java.util.Scanner;

public class SpecialNumber {
    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        // Calculate sum of factorials of digits
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Check if it's a special number
        if (sum == original) {
            System.out.println(original + " is a Special Number.");
        } else {
            System.out.println(original + " is not a Special Number.");
        }

        scanner.close();
    }
}
