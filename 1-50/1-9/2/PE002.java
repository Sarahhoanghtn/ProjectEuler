public class PE002 {
    public static void main(String[] args) {
        long sum = 2;
        long ef1 = 0;
        long ef2 = 2;
        long limit = 4000000;
        while (ef2 <= limit) {
            long ef3 = 4 * ef2 + ef1;
            if (ef3 > limit) break;
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;
        }
        System.out.println(sum);
    }
}
