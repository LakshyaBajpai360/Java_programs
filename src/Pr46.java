import java.util.Scanner;
//check year is leap or not
public class Pr46 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        n=sc.nextInt();
        if(n%100==0 && n%400==0||n%100!=0&&n%4==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("Ordinary year");
        }
    }
}
