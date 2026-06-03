//bcd to decimal
public class Pr17 {
    public static void main(String[] args) {
        // Maan lo hamare paas 2 digits ka BCD array hai (4 aur 5)
        String[] bcd = {"0100", "0101"};
        int finalDecimal = 0;

        for (int i = 0; i < bcd.length; i++) {
            String s = bcd[i];

            // 4 bits ki positional value (8, 4, 2, 1) calculate karna
            int b8 = (s.charAt(0) - '0') * 8;
            int b4 = (s.charAt(1) - '0') * 4;
            int b2 = (s.charAt(2) - '0') * 2;
            int b1 = (s.charAt(3) - '0') * 1;

            int digit = b8 + b4 + b2 + b1;

            // Decimal number banana (jaise 4 aur 5 se 45 banta hai)
            finalDecimal = (finalDecimal * 10) + digit;
        }
        System.out.println("Decimal: " + finalDecimal);
    }
}
