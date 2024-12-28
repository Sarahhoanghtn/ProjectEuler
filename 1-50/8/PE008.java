public class PE008 {
    public static void main (String[] args) {
        // Read data from file
        String num = "";
        try {
            File file = new File("D:\\ProjectEuler\\PE008.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                num += scanner.nextLine();
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println(largestProduct(num, 13));
    }
    
    static long largestProduct(String series, int consecutiveNum) {
        long largestProduct = 1;
        for (int i = 0; i < series.length() - consecutiveNum; i++) {
            long product = 1;
            for (int j = 0; j < consecutiveNum; j++) {
                int curr = series.charAt(i + j) - '0';
                if (curr == 0) break; // product will be 0 anyways
                product *= curr;
            } if (product > largestProduct) {
                largestProduct = product;
            }
        }
        return largestProduct;
    }
}
