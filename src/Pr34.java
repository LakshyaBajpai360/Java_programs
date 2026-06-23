import java.util.Scanner;
//Reversing a number
public class Pr34 {
    public static void main(String[] args) {
        int n,sum=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            sum=rem+(sum*10);
            n=n/10;
        }
        System.out.println("Reversed number is: "+sum);
    }
}
