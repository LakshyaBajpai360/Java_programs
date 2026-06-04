//bcd to greycode
public class Pr19 {
    public static void main(String[] args) {
        String[] bcd = {"0001", "0000"}; // Decimal 10 ka BCD
        int num = 0;

        // Step 1: BCD se Number nikala
        for (int i = 0; i < bcd.length; i++) {
            String s = bcd[i];
            int digit = (s.charAt(0)-'0')*8 + (s.charAt(1)-'0')*4 + (s.charAt(2)-'0')*2 + (s.charAt(3)-'0')*1;
            num = (num * 10) + digit;
        }

        // Step 2: Number ko Gray Code me badlo (Shift aur XOR formula)
        int gray = num ^ (num >> 1);

        // Step 3: Gray value ko Binary format me print kar do
        int[] grayBits = new int[20];
        int index = 0;
        while (gray > 0) {
            grayBits[index++] = gray % 2;
            gray = gray / 2;
        }

        System.out.print("Gray Code: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(grayBits[i]);
        }
    }
}
