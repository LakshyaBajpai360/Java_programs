public class Pr7 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a++);//5 iterate later after use
        System.out.println(++a);//7 use first before iterate
        System.out.println(a);//7
        System.out.println(b--);//6 iterate later after use
        System.out.println(--b);//4 use first before iterate
        System.out.println(b);//4

    }
}
