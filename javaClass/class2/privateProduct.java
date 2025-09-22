public class privateProduct {
    private int Product(int a, int b){
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        privateProduct r = new privateProduct();
        System.out.println(r.Product(60,23));
    }
}
