public class PE007 { 
    public static void main (String[] args) {
        int count = 1; //for the first prime, 2
        int i = 1;
        while (count < 10001) {
            i += 2;
            if (isPrime(i)) count++;
        }
        System.out.println(i);
    }

    static boolean isPrime(int i) {
        for (int divisor = 2; divisor <= Math.sqrt(i); divisor++) {
            if (i % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
