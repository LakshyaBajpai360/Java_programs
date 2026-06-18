import java.util.Scanner;
//prime number
public class Pr29 {
    public static void main(String[] args) {
        int n,count=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }

        }
        if (count==2){
            System.out.println("NUMBER IS PRIME");
        }
        else {
            System.out.println("NUMBER IS NOT PRIME");
        }

    }
}
