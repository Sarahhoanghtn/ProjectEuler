public class PE003 {
    public static void main(String args[]) {
        System.out.println(primeFactors(600851475143L));
    }

    public static int primeFactors(long number) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0)
                num /= i;
        }
        return i;
    }
}
