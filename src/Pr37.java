import java.util.Scanner;
//fibonacci series

public class Pr37 {
    public static void main(String[] args) {
        int n,a=0,b=1,c,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:  ");
        n= sc.nextInt();
        for (i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(a);
        }

    }
}
