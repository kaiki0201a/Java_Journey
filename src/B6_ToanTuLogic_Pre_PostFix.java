public class B6_ToanTuLogic_Pre_PostFix {
    public static void main(String[] args) {
        // "&&"  ==  "and"
        // "||" == "or"
        // "!" == "not"

        int i = 7;
        //Kiem tra i > 0 va i < 10:
        System.out.println(i>0 && i<10);    //True

        //Kiem tra i > 9 hoac i < 10
        System.out.println(i>9 || i<10);    //True

        //Phu dinh cua cai tren
        System.out.println(!(i>9 || i<10));     //False

        //TienTo - HauTo: ++ va --
        // Prefix: ++x
        //PostFix: x++

        //Thu tu uu tien: pre -> cacphepkhac -> Gan cho left -> post
        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
