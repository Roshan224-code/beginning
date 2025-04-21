import java.util.Scanner;

public class factor
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("FIND FACTORS OF NUMBER");
        System.out.print("enter a number: ");
        int n=in.nextInt();

        System.out.print("Factors of " + n + " are: ");
        for(int i=1; i<=n; i++)
        {    if (n % i == 0) {
            System.out.print(i+" ");
        }
        }
        in.close();;
    }
}
