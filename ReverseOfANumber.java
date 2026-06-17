import java.util.*;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5 digit number or higher idc");
        int n = sc.nextInt();
        if (n > 9999) {
            while (n > 0) {
                int lastdigit = n % 10;
                System.out.print(lastdigit);
                n /= 10;
            }
        } else {
            System.out.println("Invalid input man get gud only 5 digits");
        }
        sc.close();
    }
}
