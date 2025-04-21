import java.util.Scanner;

public class factorial
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("FIND FACTORIAL OF A NUMBER");
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        long sum=1;
        for (int i=1; i<=n; i++)
        {
         sum*=i;
        }
        System.out.println(":- "+sum);
    }
}
