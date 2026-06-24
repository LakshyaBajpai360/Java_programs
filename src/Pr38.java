import java.util.Scanner;

public class Pr38 {
    public static void main(String[] args) {
        int n,pow,res=1,i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        n= sc.nextInt();
        System.out.println("Enter the power: ");
        pow = sc.nextInt();

        for (i=1;i<=pow;i++){
                res=n*res;
        }
        System.out.println(res);


    }
}
