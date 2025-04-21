import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;        // get last digit
            sum += digit * digit * digit;   // cube the digit and add to sum
            number /= 10;                   // remove last digit
        }

        // Check if sum of cubes equals original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
