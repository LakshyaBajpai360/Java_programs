//simple switch program
import java.util.Scanner;

public class Pr14 {
    public static void main(String[] args) {
        float a,b;
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST VALUE :");
        a= sc.nextFloat();
        System.out.println("ENTER SECOND VALUE :");
        b= sc.nextFloat();

        System.out.println("1. FOR ADDITION");
        System.out.println("2. FOR SUBSTRACTION");
        System.out.println("3. FOR MULTIPLICATION");
        System.out.println("4. FOR DIVISION ");


        System.out.println("ENTER YOUR CHOICE :");
        ch=sc.nextInt();

        switch (ch){
            case 1:

                System.out.println("ADDITION IS  ");
                System.out.println(a+b);
                break;//break nahi lagayenge to sabka output ek sath aane lagega
            case 2:

                System.out.println("SUBSTRACTION  IS  ");
                System.out.println(a-b);
                break;
            case 3:

                System.out.println("MULTIPLICATION IS  ");
                System.out.println(a*b);
                break;
            case 4:

                System.out.println("DIVISION IS  ");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Choice");


        }
    }
}
