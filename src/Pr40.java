import java.util.Scanner;
//simple factorial
public class Pr40 {
    public static void main(String[] args) {
        int i=1,n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        do {
            fact=fact*i;
            i++;

        }
        while (i<=n);
    }
}
