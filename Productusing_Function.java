import java.util.*;
public class Productusing_Function {
    public static int Product (int a,int b){
        // a = 5;
        // b = 10;
        int product = a * b;
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a :- ");
        int A = sc.nextInt();
        System.out.print("Enter the value of b :- ");
        int B = sc.nextInt();
        sc.close();
        
        int product1= Product(A,B);
        System.out.println("Product of given no. is :- " + product1);
    }
}
