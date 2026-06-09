//Abundant number or excessive
//Abundant Number ka matlab hota hai ek aisa number jiske saare tukde (divisors) ko agar hum aapas me jodein (add karein)
//,toh unka total (sum) us asli number se bada nikal jaye.
//(Bas ek shart hai: Tukdo me hum us asli number ko khud shaamil nahi karte. Unhe 'proper divisors' kehte hain).
//12 kis-kis ke table me aata hai?
//1, 2, 3, 4, 6, aur 12.
//12 ko chhodkar baki saare tukde lo:
//1, 2, 3, 4, aur 6.
//Ab in sabko aapas me Plus (+) karo:
//1 + 2 + 3 + 4 + 6 = 16
//Ab dekho, in tukdo ka total aaya 16,
// jo ki asli number 12 se bada hai (16 > 12). Isiliye 12 ek Abundant Number hai.
//Agar total bada nahi aata (jaise number 10 me total 8 hi aata hai), toh wo abundant number nahi hota.
import java.util.Scanner;

public class Pr24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koi bhi number enter karo: ");
        int n = sc.nextInt();

        int sum = 0; // Isme hum saare tukdo ka total jama karenge

        // Loop chalayenge 1 se lekar n/2 tak
        // Kyunki kisi bhi number ka sabse bada tukda uske aadhe (half) se bada nahi ho sakta
        for (int i = 1; i <= n / 2; i++) {

            // Agar n, i se poora divide ho jata hai (remainder 0 aata hai)
            if (n % i == 0) {
                sum = sum + i; // Toh i ko sum me plus kar do
            }
        }

        // Akhiri me check karenge ki total asli number se bada hai ya nahi
        if (sum > n) {
            System.out.println(n + " ek Abundant Number hai!");
            System.out.println("Kyunki iske tukdo ka total " + sum + " hai, jo " + n + " se bada hai.");
        } else {
            System.out.println(n + " Abundant Number nahi hai.");
            System.out.println("Kyunki iske tukdo ka total " + sum + " hai, jo " + n + " se chhota ya barabar hai.");
        }

        sc.close();
    }
}
