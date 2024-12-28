public class PE009 {
    public static void main (String[] main) {
        System.out.println(specialPythTriplet(1000));
    }

    static int specialPythTriplet(int sum) {
        // a and b have to be at least 1 each => largest c = 998
        // c > b > a => largest b = 997 & largest a = 996
        for (int a = sum - 4; a > 1; a--) {
            for (int b = a + 1; b <= sum - 3; b++) { // b has to be bigger than a
                int c = sum - a - b;
                if (isPyth(a, b, c)) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }
  
    static boolean isPyth(int a, int b, int c) {
        double aSquare = Math.pow(a, 2);
        double bSquare = Math.pow(b, 2);
        double cSquare = Math.pow(c, 2);

        return (aSquare + bSquare == cSquare);
    }
}
