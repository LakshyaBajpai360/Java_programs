
// strong number
//A Strong Number (also sometimes called a Krishnamurthy number or Peterson number) is a special number
// whose sum of the factorial of its digits is equal to the number itself.
// like "1!"=1,"4!"=24,"5!"=120
//1+24+120=145

import java.util.Scanner;

public class Pr21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int totalSum = 0;

        // Loop to separate digits
        while (temp > 0) {
            int digit = temp % 10;

            // Calculate factorial of the digit directly
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            totalSum = totalSum + fact;
            temp = temp / 10;
        }

        // Check if strong number or not
        if (totalSum == num) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }

        sc.close();


    }
}
