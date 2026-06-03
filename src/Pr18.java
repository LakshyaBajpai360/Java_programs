//bcd to binary
public class Pr18 {
    public static void main(String[] args) {
        String[] bcd = {"0001", "0010"}; // Decimal 12 ka BCD
        int decimal = 0;

        // Step 1: BCD se Decimal nikalo
        for (int i = 0; i < bcd.length; i++) {
            String s = bcd[i];
            int digit = (s.charAt(0)-'0')*8 + (s.charAt(1)-'0')*4 + (s.charAt(2)-'0')*2 + (s.charAt(3)-'0')*1;
            decimal = (decimal * 10) + digit;
        }

        // Step 2: Decimal ko Binary me badlo (Reminders nikal kar)
        int[] binary = new int[20];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        // Binary array ko ulta print karo
        System.out.print("Pure Binary: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
