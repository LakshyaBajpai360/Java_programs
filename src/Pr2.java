//FIRST USER INPUT PROGRAM
import java.util.Scanner;
public class Pr2 {
    public static void main(String[] args) {
        int roll;
        String name;
        char grade;
        float avg;
        double per;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----PLEASE ENTER THE STUDENT DETAILS-----");
        System.out.println("ENTER STUDENT NAME: ");
        name= sc.nextLine();
        System.out.println("ENTER HIS/HERS ROLL NUMBER: ");
        roll= sc.nextInt();
        System.out.println("ENTER THE GRADE: ");
        grade=sc.next().charAt(0);
        System.out.println("ENTER THE AVERAGE :");
        avg=sc.nextFloat();
        System.out.println("ENTER PERCENTAGE: ");
        per= sc.nextDouble();
        System.out.println("STUDENT NAME IS "+name);
        System.out.println("STUDENT ROLL NUMBER IS "+roll);
        System.out.println("STUDENT GRADE IS "+grade);
        System.out.println("STUDENT AVERAGE IS "+avg);
        System.out.println("STUDENT PERCENTAGE IS "+per);

    }
}
