import java.util.Scanner;

public class Pr31 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value: ");
        a= sc.nextInt();
        System.out.println("Enter second value: ");
        b= sc.nextInt();
        System.out.println("----Before swapping----");
        System.out.println(" FIRST VALUE IS "+a);
        System.out.println(" SECOND VALUE IS "+b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("----AFTER SWAPPING----");
        System.out.println("FIRST VALUE IS "+a);
        System.out.println("SECOND VALUE IS "+b);


    }
}
