import java.util.*;
public class Function_Parameters {

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input value of a:- ");
        int a = sc.nextInt();
        System.out.print("Input value of b:- ");
        int b = sc.nextInt();
        sc.close();
        int sum1 = calculateSum(a, b);
        System.out.println("sum is :- " + sum1);
    }
}
