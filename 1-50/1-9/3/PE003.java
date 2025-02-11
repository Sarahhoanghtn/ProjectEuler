public class PE003 {
    public static void main(String args[]) {
        long target = 600851475143L;
        long i = 2;

        while (i * i <= target) { // Only check up to sqrt(target)
            if (target % i == 0)
                target /= i;
            else i++;
        }
        
        System.out.println(target);
    }
}
