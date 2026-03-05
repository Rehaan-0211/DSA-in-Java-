import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
        sc.close();
    }   
}