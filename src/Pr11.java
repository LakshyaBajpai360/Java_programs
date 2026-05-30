//if-else example
import java.util.Scanner;

public class Pr11 {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        a=sc.nextFloat();
        System.out.println("ENTER THE SECOND NUMBER : ");
        b = sc.nextFloat();
        if (a>b){
            System.out.println("your "+a+" is greater than "+b);

        }
        else {
            System.out.println("your "+b+ " is greater than "+a);
        }
    }

}
