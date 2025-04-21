import java.util.Scanner;

public class sumofseries1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        StringBuilder series = new StringBuilder();

        // Loop to calculate sum and build series string
        for (int i = 1; i <= n; i++) {
            int term = i * (i + 1);
            sum += term;

            series.append(i).append("*").append(i + 1);
            if (i != n) {
                series.append(" + ");
            }
        }

        // Output the series and sum
        System.out.println("Series: " + series.toString());
        System.out.println("Sum of the series is: " + sum);

        scanner.close();
    }
}
