import java.util.*;

public class PrintNumbersToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        int range = sc.nextInt();
        int number = 1;
        
        while (number <= range) {
            System.out.print(number + " ");
            number++;
        }
        sc.close();
    }
}
