public class B4_EpKieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = a/b;

        // Ep tu be -> lon
        System.out.println(kq); // -> 0.0
        kq = (double) a/ b; // ep a: int >> double
        System.out.println(kq); // -> 0.5

        // Ep tu lon -> be: co the bi mat du lieu
        int c = 128;    // vi byte luu tu -128 -> 127
        byte d = (byte) c;
        System.out.println(c);  // -> 128
        System.out.println(d);  // -> -128: sai

        int e = 15; //-> 15
        byte f = (byte) e; // -> 15

        int s = 10;
        // float s = (float) s; sai vi khong the doi kieu s mot cach thoai mai
        System.out.println(s);

    }
}
