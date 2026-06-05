//Perfect Number ek aisa number hota hai jiske saare proper divisors
// (wo numbers jo use poora divide karte hain, lekin us number ko khud
// chhod kar) ka sum usi number ke barabar ho.
//6 ke divisors hain: 1, 2, aur 3 (6 ko nahi ginenge).Inka sum: 1 + 2 + 3 = 6.
// Kyunki sum aur original number barabar hain, isliye 6 ek Perfect Number hai.
import java.util.Scanner;
public class Pr20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ek number enter karein: ");
        int n = sc.nextInt();

        int sum = 0;

        // Loop 1 se n-1 tak
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Final check
        if (sum == n) {
            System.out.println(n + " ek Perfect Number hai! ");
        } else {
            System.out.println(n + " Perfect Number nahi hai. ");
        }

        sc.close();
    }
}
