import java.lang.StringBuilder;

public class PE004 {
    public static int product = 0;

    public static void main(String[] args) {
        System.out.println(largestProduct(101, 999));
    }
  
    private static boolean isPal() {
        String pal = String.valueOf(product);
        StringBuilder pal2 = new StringBuilder(""+ product);
        pal2.reverse();
        return pal.equals(pal2.toString());
    }

    private static int largestProduct (int smallest, int biggest) {
        int largestProduct = 1;

        for (int i = biggest; i > smallest; i--) {
            for (int j = i; j > largestProduct / i; j--) { // avoid traversing through products < current largestProduct & repeating product pairs
                product = i * j;
                if (isPal() && product > largestProduct) {
                    largestProduct = product;
                }
            }
        }
        return largestProduct;
    }
}
