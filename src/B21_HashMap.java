import java.util.HashMap;
import java.util.Map;

public class B21_HashMap {
    static void main() {
        //1. Khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        //2. Them cac phan tu
        map.put(1, "apple");
        map.put(1, "banana");
        map.put(1, "cherry");   //ghi de vao nhau

        //3. Lay gia tri
        String va1 = map.getOrDefault(1,"0");

        //4. Xoa mot phan tu
        // map.remove("key")

        //5. Kiem tra co ton tai Key, Value
        boolean checkkey = map.containsKey(1);
        boolean checkva = map.containsValue("apple");

        //6. Kiem tra rong
        boolean rong = map.isEmpty();

        //7. Lay so luong
        int len = map.size();

        //8. Duyet nhanh qua tung key
        for (Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " :" + value);
        }
        //9. Duyet nhanh qua ca key, item
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " :" + value);
        }
        
    }
}
