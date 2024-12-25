public class PE006 {
    public static void main(String[] args) {
        System.out.println(squareSum() - sumSquare());
    }

    private static int sumSquare() {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return (int) sum;
    }

    private static int squareSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
