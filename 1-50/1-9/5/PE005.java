public class PE005 {
    public static void main (String[] args) {
        System.out.println(PE005());
    }
    
    static double PE005() {
        int prod = 20 * 19;
        double i = Math.ceil(2520 / prod) * prod; // find the lowest number divisible by 19 * 20 > 2520
        
        while (true) {
            i += prod; // i is divisible by 19 and 20 only if i is divisible by 19 * 20
            for (int j = 18; j > 10; j--) { // if divisible by 11-20, i is divisible by 1-10
                if (i % j != 0) break;
                if (j == 11) return i;
            }
        }
    }
}
