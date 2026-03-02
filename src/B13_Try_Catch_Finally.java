public class B13_Try_Catch_Finally {
    static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        }
        catch (Exception ex){
            System.out.println("Co loi roi");
            ex.printStackTrace();
        }
        System.out.println("After");

    }

}
