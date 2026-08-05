public class DecimalToBinary {
    public static int DecNum(int n) {
        int bin = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        int Binary = DecNum(7);
        System.out.println("Value of Binary Number for the given Decimal Value is " + Binary);
    }
}
