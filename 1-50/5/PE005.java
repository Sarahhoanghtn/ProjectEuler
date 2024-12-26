public class PE005 {
    public static void main (String[] args) {
        System.out.println(evenlyDividedBy1To20());
    }
    
    static int evenlyDividedBy1To20() {
        int i = 2520;
        while (true) {
            i += 2;
            for (int j = 20; j > 10; j--) { // if divisible by 11-20, i is divisible by 1-10
                if (i % j != 0) break;
                if (j == 11) return i;
            }
        }
    }
}
