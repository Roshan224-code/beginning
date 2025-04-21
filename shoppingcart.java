import java.sql.SQLOutput;
import java.util.Scanner;

public class shoppingcart
{
    // shopping cart program
    public static void main(String[] args)
    {
        char currency='$';
        Scanner in = new Scanner(System.in);
        System.out.print("what item did you buy ? : ");
        String item=in.nextLine();
        System.out.print("Price of each "+item+" ?(₹): ");
        double price = in.nextDouble();
        System.out.print("what's the quantity of "+item+" : ");
        int quantity = in.nextInt();

        double total=quantity*price;

        System.out.print("You bought "+quantity+" "+item+"s.\n");
        System.out.print("Your total is ₹"+total);

        in.close();


    }
}
