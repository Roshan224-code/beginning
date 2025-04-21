import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare original and copy arrays
        int[] original = new int[size];
        int[] copy = new int[size];

        // Input elements into original array
        System.out.println("Enter " + size + " elements for the original array:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }

        // Copying elements to copy array
        for (int i = 0; i < size; i++) {
            copy[i] = original[i];
        }

        // Display copied array
        System.out.println("Copied array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(copy[i] + " ");
        }

        scanner.close();
    }
}
