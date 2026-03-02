public class B18_Array {
    static void main() {
        // Diem khac so voi list trong python:
        /*
        - Dong nhat kieu du lieu
        - Size co dinh
         */

        //1. Khai bao mang: <type>[] <name>;
        int[] mangNguyen;
        String[] mangStr;
        boolean[] mangBool;

        //2. Khoi tao mang kem theo kich thuoc
        String[] mangStr2 = new String[15];

        //3. Khoi tao mang kem theo gia tri
        String[] mangStr3 = new String[] {"chi pheo", "thi no", "ong giao"};
        String[] mangStr4 = {"chi pheo", "thi no", "ong giao"};

        // but can't : String[] mang = new String[3] {"chi pheo", "thi no", "ong giao"};

        // Duyet mang
        //C1. Dung ind
        for (int i = 0; i < mangStr3.length; i++ ){
            System.out.println(mangStr3[i]);
        }

        //C2. Dung :
        for (String va : mangStr3) {
            System.out.println(va);
        }


    }
}
