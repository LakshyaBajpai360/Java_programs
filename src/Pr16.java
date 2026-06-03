//decimal to bcd
public class Pr16 {
    public static void main(String[] args) {
        int num = 45; // Input number
        int[] digits = new int[10];
        int count = 0;

        // Step 1: Har ek digit ko alag karke array me dalo (ulta milega)
        while (num > 0) {
            digits[count] = num % 10;
            num = num / 10;
            count++;
        }

        // Step 2: Array ko piche se read karo aur 4-bit binary print karo
        for (int i = count - 1; i >= 0; i--) {
            int digit = digits[i];

            // 4-bit binary print karne ka manual tareeka
            System.out.print((digit / 8) % 2);
            System.out.print((digit / 4) % 2);
            System.out.print((digit / 2) % 2);
            System.out.print((digit / 1) % 2);
            System.out.print(" "); // space
        }
    }
}
