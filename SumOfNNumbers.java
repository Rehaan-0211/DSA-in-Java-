import java.util.*;
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your desired value:");
        int range = sc.nextInt();
        int sum = 0;

        int i = 1;

        while (i<= range){
            sum += i;
            i++;
        }
        System.out.println("The value of sum of all natural number is :" + sum);
        sc.close();
    }
    
    
}

