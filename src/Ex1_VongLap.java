import java.util.Scanner;

public class Ex1_VongLap {
    static void main() {
        //So hoan hao: tong uoc = no
        System.out.println("Nhap so can kiem tra: ");
        int s = new Scanner(System.in).nextInt();

        int h = (int) s /2;
        int total = 0;
        for (int i = 1; i <= h; i ++) {
            if (s % i == 0) {
                total += i;
            }
        }
        if (s == total) {
            System.out.println(s + " la so hoan hao");
        }
        else {
            System.out.println(s + " khong phai la so hoan hao");
        }



    }
}
