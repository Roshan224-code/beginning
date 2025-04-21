import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList of Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Input size
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        // Add elements using add() method
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            numbers.add(num); // add() method
        }

        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Display sum
        System.out.println("Sum of the elements: " + sum);

        scanner.close();
    }
}
