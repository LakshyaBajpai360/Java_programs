//Deficient Number(sare prime numbers deficient number hote hain kyunki un sabka divisor sirf 1 hota  hai )
//Agar kisi number ke saare proper divisors (yaani wo saare numbers jisse wo divide hota hai,
// khud us number ko chhodkar)
// ka sum us number se chhota ho, to use Deficient Number kahte hain.
//ex:21
//21 ke divisors: 1, 3, 7 (hum 21 ko nahi ginege kyunki proper divisor chahiye).
//Divisors ka Sum: 1 + 3 + 7 = 11
//Ab dekho, sum (11) chhota hai original number (21) se. Isliye 21 ek Deficient Number hai.
import java.util.Scanner;

public class Pr25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Koi bhi number daalo: ");
        int num = sc.nextInt();

        int sum = 0;

        // Loop chalakar saare proper divisors ka sum nikalenge
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i; // Agar i divisor hai, to sum me jod do
            }
        }

        // Check karenge ki sum number se chhota hai ya nahi
        if (sum < num) {
            System.out.println(num + " ek Deficient Number hai.");
        } else {
            System.out.println(num + " Deficient Number NAHI hai.");
        }

        sc.close();
    }
}
