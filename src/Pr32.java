import java.util.Scanner;
//Armstrong number
public class Pr32 {
    public static void main(String[] args) {
        int n,temp,rem,arm=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        temp=n;
        while (n>0){
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(temp==arm){
            System.out.println(" Number is armstrong ");
        }
        else {
            System.out.println(" Number is not armstrong");
        }


    }
}
