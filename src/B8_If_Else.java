import java.util.Scanner;

public class B8_If_Else {
    public static void main(String[] args) {

        /*
        if (condition1)
        {
           // block of code to be executed if condition1 is True
        }
        else if (condition2)
        {
            // block of code to be executed if condition1 is False and condition2 is True
        }
        else
        {
            // block of code to be executed if both conditions are False
        }
         */



        // ToanTu3Ngoi:<type>  <ten_bien> = (condition1) ? <excutedTrue> : <exucutedFalse> ;


        //Viet Chuong Trinh Phan Loai HSG
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dtb: ");
        double dtb = sc.nextDouble();

        String res = (dtb >= 8.0)? "Gioi":
                ((dtb >= 6.5) ? "Kha":"Trung Binh");
        System.out.println(res);

        }

    }

