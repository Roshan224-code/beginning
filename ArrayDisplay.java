import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create array
        int[] arr = new int[size];

        // Take input for each element
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display the array
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
