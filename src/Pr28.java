import java.util.Scanner;

//odd even program without modulas operator
public class Pr28 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        n= sc.nextInt();
         while (n>1){
             n=n-2;
         }
         if (n==1){
             System.out.println("no. is odd ");
         }
         else {
             System.out.println("no. is even ");
         }
    }
}
