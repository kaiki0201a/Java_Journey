import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang: ");
        //Tao n
        int n = sc.nextInt();

        //Tao mang
        int[] mangNguyen = new int[n];

        //Nhap du lieu cho mang

        for (int i= 0; i < n; i++){
            System.out.println("M["+i+"] = ");
            mangNguyen[i] = sc.nextInt();
        }

        //Xuat de xem mang
        System.out.println("Mang la: ");
        System.out.println(Arrays.toString(mangNguyen));

    }
}
