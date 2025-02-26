public class PE006 {
    private static double sumSquare() {
        double sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i * i;
        }

        return sum;
    }

    private static double squareSum() {
        double sum = (100.0 / 2) * (1 + 100); // Arithmetic Sequence
        return Math.pow(sum, 2);
    }

    public static void main(String[] args) {
        System.out.println((int) (squareSum() - sumSquare()));
    }
}
