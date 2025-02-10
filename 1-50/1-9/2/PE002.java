public class PE002 {
    public static void main(String[] args) {
        long limit = 4000000;
        long sum = 2;
        long evenFib1 = 0;
        long evenFib2 = 2;

        while (true) {
            long evenFib3 = 4 * evenFib2 + evenFib1;
            if (evenFib3 > limit) break;

            sum += evenFib3;
            evenFib1 = evenFib2;
            evenFib2 = evenFib3;
        }

        System.out.println(sum);
    }
}
