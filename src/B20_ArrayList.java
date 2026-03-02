import java.util.ArrayList;
import java.util.List;

public class B20_ArrayList {
    static void main() {
        // 1.Khai bao list
        ArrayList<Integer> lst = new ArrayList<>();

        // 2.Khai bao voi so luong pt ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);

        // 3. Khoi tao list voi cac pt ban dau
        ArrayList<Integer> ls3 = new ArrayList<>(List.of(1,2,3,4,5,6));

        // Truy xuat va sua doi

        // Them phan tu: append/ insert() -> add(id,value)
        // Lay gia tri: <> item = list.get(0);
        // Dat gia tri moi: list.set(id, "new");
        // Lay do dai: int len = list.size();

        // Xoa, tim kiem

        // remove(id) / remove("value")
        // Tim kiem: if list.contain("") hoac list.indexOf("A")
        // Xoa .clear()
        // is.Empty()

        // Sap xep

        // list.sort()
        // list.sort(Collection.reverseOrder())


    }
}
