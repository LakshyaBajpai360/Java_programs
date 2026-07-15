import java.util.Scanner;

public class Pr42 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        n= sc.nextInt();
        for (i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
