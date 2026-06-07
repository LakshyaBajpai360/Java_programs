//harshad number
//Agar koi number apne digits ke sum se
// poora divide (divisible) ho jaye, to use Harshad Number kehte hain.
//Example : 18 Digits ka sum: 1 + 8 = 9
//Check: Kya 18, 9 se divide hota hai? Haan (18 \% 9 == 0). So, 18 ek Harshad Number hai.

import java.util.Scanner;

public class Pr22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. :");

        // Input lena
        int num = sc.nextInt();

        int originalNum = num; // Original number ko save kar rahe hain
        int sum = 0;

        // Digits ka sum nikalne ka loop
        while (num > 0) {
            int rem = num % 10;  // Last digit nikala
            sum = sum + rem;     // Sum me add kiya
            num = num / 10;      // Last digit ko remove kiya
        }

        // Check karna ki original number sum se divide hota hai ya nahi
        if (sum != 0 && originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad Number.");
        } else {
            System.out.println(originalNum + " is not a Harshad Number.");
        }

        sc.close();
    }
}
