import java.util.Scanner;

public class sumofpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values of n and x
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of power(x): ");
        int x = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, x);
        }

        System.out.println("Sum of i^x from i=1 to "+n+" is: " + sum);
        sc.close();
    }
}
