import java.util.Scanner;

public class sumofseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        StringBuilder series = new StringBuilder();

        // Build the series and calculate the sum
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
                series.append(" - ").append(i);
            } else {
                if (i != 1) {
                    series.append(" + ");
                }
                series.append(i);
                sum += i;
            }
        }

        // Output the full series and result
        System.out.println("Series: " + series.toString());
        System.out.println("Sum of the series is: " + sum);

        scanner.close();
    }
}
