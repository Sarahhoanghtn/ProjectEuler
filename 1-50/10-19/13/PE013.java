public class PE013 {
    static ArrayList<String> nums = new ArrayList<>();
    public static void main (String[] args) {
        BigInteger sum = BigInteger.valueOf(0);
        try {
            File file = new File("D:\\projectEuler\\PE013.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                sum = sum.add(new BigInteger(scanner.nextLine()));
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(sum.toString().substring(0, 10));
    }
}
