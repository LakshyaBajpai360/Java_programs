import java.util.Scanner;
//product of digits
public class Pr36 {
    public static void main(String[] args) {
        int n,pro=1,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n= sc.nextInt();
        while (n>0){
            rem=n%10;
            pro=pro*rem;
            n=n/10;

        }
        System.out.println("Product of digits is: "+pro);

    }
}
