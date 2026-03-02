public class B14_Method {
    static void main() {
        int kq = cong2so(1,2);
        System.out.println(kq);

        // Vi khong co return nen chi can goi ten ham
        xinChao("female");
    }

    //Ham co return : khong co void
    public static int cong2so(int x, int y) {
        return x + y;
    }

    //Ham thu tuc: khong co return
    public static void xinChao(String gioitinh){
        if (gioitinh.equals("female")){
            System.out.println("Xin chao, toi la nu");
        }
        else
            System.out.println("Xin chao, toi la nam");
        giaiPT(1,1,1);
    }

    //BT: Giai phuong trinh bac 2
    public static void giaiPT(double a, double b, double c) {
        double denta = Math.pow(b, 2) - 4*a*c;

        if (denta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (denta == 0){
            System.out.println("Phuong trinh co nghiem kep la: " + (-b/(2*a)));
        }
        else{
            System.out.println("Nghiem thu nhat: "+ ((-b+Math.pow(denta, 0.5))/(2*a)));
            System.out.println("Nghiem thu 2: "+ ((-b-Math.pow(denta, 0.5))/(2*a)));
        }
    }

}
