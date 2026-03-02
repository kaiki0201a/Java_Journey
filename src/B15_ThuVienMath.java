public class B15_ThuVienMath {
    static void main() {
        // PI:
        System.out.println("PI = "+ Math.PI);

        // abs(x)
        int a = -8;
        System.out.println(Math.abs(a));

        // max,min
        System.out.println(Math.max(4,6));
        System.out.println(Math.min(4,6));

        // sqrt -> double
        System.out.println("Can 2 cua 4: "+ Math.sqrt(4));

        // Luy thua -> double
        System.out.println("2^3 = :"+Math.pow(2,3));

        //sin,cos,tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180); //tuong tu voi cos va tan

    }
}
