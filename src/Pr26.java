//LCM
import java.util.Scanner;

public class Pr26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pehla number: ");
        int n1 = sc.nextInt();

        System.out.print("Doosra number: ");
        int n2 = sc.nextInt();

        // Jo number bada hai, wahan se check karna shuru karenge
        int lcm = (n1 > n2) ? n1 : n2;

        // Loop tab tak chalega jab tak dono numbers se divide hone wala number nahi milta
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("LCM hai: " + lcm);
                break; // Answer milte hi loop rok do
            }
            lcm++; // Agla number check karo
        }

        sc.close();
    }
}
