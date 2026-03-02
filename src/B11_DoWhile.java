public class B11_DoWhile {
    public static void main(String[] args) {

        // Tinh tong cac so tu 1 -> 5
        int sum = 0;
        int a = 1;

        do {
            sum = sum + a;
            a++;
        }
        while (a <= 5);
        System.out.println("Tong tu 1->5: "+sum);
    }
}
