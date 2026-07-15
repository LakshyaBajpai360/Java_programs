import java.util.Scanner;
//multiplication table
public class Pr39 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n= sc.nextInt();
        for (i=1;i<=10;i++){

            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
