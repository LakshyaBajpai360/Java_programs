//nested if-else
import java.util.Scanner;

public class Pr13
{
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        a = sc.nextFloat();
        System.out.println("ENTER THE SECOND NUMBER : ");
        b = sc.nextFloat();
        System.out.println("ENTER THE THIRD NUMBER : ");
        c = sc.nextFloat();
        if (a > b) {

            if (a > c)
            {
                System.out.println("your " + a + " is greater than " + b + " and " + c);
            }
            else
            {
                System.out.println("your " + c + " is greater than " + b + " and " + a);

            }
        }
        else
        {
            if (b > c)
            {
                System.out.println("your " + b + " is greater than " + a + " and " + c);
            }
            else
            {
                System.out.println("your " + c + " is greater than " + b + " and " + a);
            }


        }
    }
}
