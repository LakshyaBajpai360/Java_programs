import java.util.Scanner;
//SIMPLE SWAPPING USING THIRD VARIABLE
public class Pr30 {
    public static void main(String[] args) {
        int a,b,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        a= sc.nextInt();
        System.out.println("Enter second value: ");
        b= sc.nextInt();
        System.out.println("----Before swapping----");
        System.out.println(" FIRST VALUE IS "+a);
        System.out.println(" SECOND VALUE IS "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("----AFTER SWAPPING----");
        System.out.println("FIRST VALUE IS "+a);
        System.out.println("SECOND VALUE IS "+b);

    }
}
