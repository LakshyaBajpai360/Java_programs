//else-if
import java.util.Scanner;

public class Pr12 {
    public static void main(String[] args) {

        float stu1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS OF STUDENT :");
        stu1= sc.nextFloat();
        if (stu1>=100){
            System.out.println("he is genious ");
        }
        else if (stu1>=90) {
            System.out.println("he is intelligent  ");
        }
        else if (stu1>=70) {
            System.out.println("he is above average student ");
        }
        else if (stu1>=50) {
            System.out.println("he is average student ");
        }
        else if (stu1>=33) {
            System.out.println("just passed  ");
        }
        else {
            System.out.println("fail ");
        }



    }
}
