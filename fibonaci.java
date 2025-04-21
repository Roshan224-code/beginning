import java.util.Scanner;

public class fibonaci
 {
    public static void main(String[] args)
    {
        int a = 0, b = 1;
        Scanner in= new Scanner(System.in);
        System.out.println("DISPLAYING FIBONACCI SERIES");
        System.out.print("enter the no. of terms to be dispalyed: ");
        int n=in.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        in.close();
    }
}

