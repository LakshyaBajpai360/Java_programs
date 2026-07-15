import java.util.Scanner;
//sum of odd and even numbers in a given range
public class Pr43 {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        n= sc.nextInt();
        if(n%2==0){
            for (i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("sum of even numbers is "+sum);
        }
        else {
            for (i=1;i<=n;i=i+2){
                sum=sum+i;

            }
            System.out.println("Sum of odd number "+sum);
        }
    }
}
