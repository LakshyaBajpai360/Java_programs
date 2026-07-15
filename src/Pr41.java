import java.util.Scanner;
//print all odd numbers in a given range
public class Pr41 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        n=sc.nextInt();
        for (i=1;i<=n;i=i+2){
            System.out.println(i);
        }

    }
}
