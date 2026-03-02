import java.util.Scanner;
public class B9_Switch {
    public static void main(String[] args) {
        //Math value
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen can kiem tra: ");
        int a = sc.nextInt();

        int b = a % 2;
        switch (b) {
            case 0:
                System.out.println(a + " la so chan");
                break;
            default:
                System.out.println(a + " la so le");
                break;
        }
    }
}
