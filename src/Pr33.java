import java.util.Scanner;
//Palindrome number
public class Pr33 {
    public static void main(String[] args) {
        int n,temp,sum=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        temp=n;
        while (n>0){
            rem=n%10;
            sum=rem+(sum*10);
            n=n/10;

        }
        if (temp==sum){
            System.out.println("Yes! It is Palindrome Number");
        }
        else{
            System.out.println("NO! It is not Palindrome Number");
        }

    }
}
