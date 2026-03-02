import java.util.Scanner;    // B1: Import

public class B7_Input {
    public static void main(String[] args) {
        //B2: Khoi tao may quet
        Scanner sc = new Scanner(System.in);

        //Lay Chuoi: Ham nextLine don sach dau \n con ham nextInt va Double thi khong
        System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();

        // Lay So
        System.out.println("Nhap tuoi cua ban: ");
        int age = sc.nextInt();

        // Lay So Thap Phan
        System.out.println("Nhap diem GPA cua ban: ");
        double gpa = sc.nextDouble();

        // In ra kết quả
        System.out.println("--- THÔNG TIN CỦA BẠN ---");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm: " + gpa);

        // BT: tinh chu vi, ban kinh cua duong tron
        System.out.println("Nhap vao ban kinh: ");
        Double banKinh = new Scanner(System.in).nextDouble();

        System.out.println("Chu vi cua hinh tron la: " + (banKinh * 2 * Math.PI));
        System.out.println("Dien tich cua hinh trong la: " + (Math.PI * Math.pow(banKinh, 2)));

        // Thói quen tốt: Đóng Scanner khi không dùng nữa để giải phóng bộ nhớ
        sc.close();
    }
}
