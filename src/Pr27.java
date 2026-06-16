import java.util.Scanner;

//simple odd even program
public class Pr27 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets check your number is odd or even ");
        System.out.println("Enter your number: ");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even ");
        }
        else {
            System.out.println(n+" is odd ");
        }
    }
}
