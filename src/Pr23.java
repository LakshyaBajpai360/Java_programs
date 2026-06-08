//GCD(greatest common divisor)
//Maan lo aapke paas 12 laddoos hain aur 18 pedas hain. Aapko unhe kuch bachhon
// me is tarah baantna hai ki har bachhe ko barabar laddoos aur barabar pedas milein, aur kuch bhi bache nahi.
//Toh aap maximum 6 bachhon me hi unhe barabar baant sakte ho (har bachhe ko 2 laddoos aur 3 pedas milenge).
import java.util.Scanner;

public class Pr23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pehla number daalo: ");
        int a = sc.nextInt();

        System.out.print("Doosra number daalo: ");
        int b = sc.nextInt();

        // Jab tak b ki value 0 nahi ho jaati, loop chalega
        while (b != 0) {
            int rem = a % b;  // Remainder nikala
            a = b;            // b ko a me daal diya
            b = rem;          // Remainder ko b me daal diya
        }

        // Loop khatam hone ke baad 'a' me GCD hoga
        System.out.println("GCD hai: " + a);

        sc.close();
    }
}
