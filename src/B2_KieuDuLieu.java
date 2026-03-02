public class B2_KieuDuLieu {
    public static void main(String[] args) {
        //Su dung wrapper class de kiem tra gia tri
        //Luu tru toi da - toi thieu

        //1. Kieu so nguyen: int
        System.out.println("Min cua kieu int: "+Integer.MIN_VALUE);
        System.out.println("Max cua kieu int: "+Integer.MAX_VALUE);

        //2. Kieu byte
        System.out.println("Min cua kieu byte: "+Byte.MIN_VALUE);
        System.out.println("Max cua kieu byte: "+Byte.MAX_VALUE);

        //3. Kieu char: co the dung so de bieu thi trong bang ma ASCII
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }
}
