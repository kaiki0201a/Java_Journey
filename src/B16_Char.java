import java.util.Scanner;

public class B16_Char {
    static void main() {
        // Khai bao - khoi tao
        char ch1 = 'a';
        char ch2 = 66;

        char ch3;

        // Lay ki tu
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ki tu: ");
        String input = sc.nextLine();
        char ch4 = input.charAt(0);
        System.out.println("Ki tu do la: " + ch4);

        // So sanh ki tu
        // KQ la ord(x) - ord(y)
        System.out.println(Character.compare('A', 'A'));

        System.out.println(Character.compare('A', 'a'));// 65- 97 = -32

    }
}
