import java.util.Scanner;
//count number of digits
public class Pr45 {
    public static void main(String[] args) {
        int n,count=0,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        n= sc.nextInt();
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits are:"+count);
    }
}
