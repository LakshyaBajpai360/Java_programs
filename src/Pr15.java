//more advance switch statement example with test cases


import java.util.Scanner;

public class Pr15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pehla number maangega
        System.out.print("Pehla Number daalo (e.g., 20): ");
        int num1 = sc.nextInt();

        // 2. Doosra number maangega
        System.out.print("Doosra Number daalo (e.g., 5): ");
        int num2 = sc.nextInt();

        // 3. Operator maangega (Kachra input safe karne ke liye String liya hai)
        System.out.print("Operator daalo (+, -, *, /) ya kuch bhi galat check karne ke liye: ");
        String operator = sc.next();

        System.out.println("\n--- RESULT ---");

        // Switch logic chalega
        switch (operator) {
            case "+":
                System.out.println("Answer: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Answer: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Answer: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Answer: " + (num1 / num2));
                } else {
                    System.out.println("[ERROR] ❌ Zero se divide nahi ho sakta!");
                }
                break;
            default:
                // Agar tune kachra daala toh warning print hogi
                System.out.println("[WARNING] ⚠️ '" + operator + "' ek galat operator hai bhai!");
                System.out.println("Sirf +, -, *, / hi chalega.");
                break;
        }

        sc.close();
    }
}
