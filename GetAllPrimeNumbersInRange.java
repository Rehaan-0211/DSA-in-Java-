import java.util.*;

public class GetAllPrimeNumbersInRange {
    public static boolean Isprime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Input a number to find out how many prime numbers it has from the range of 0 :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int a = 2; a <= n; a++) {
            if (Isprime(a)) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
