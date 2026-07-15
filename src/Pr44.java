import java.util.Scanner;
//check number is positive or negative
public class Pr44 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative ");
        }
    }
}
