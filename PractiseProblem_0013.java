// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
import java.util.*;
public class PractiseProblem_0013 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a value and from its range from one to n(your specified number all the even and odd integers that come in between i will print the sum of each separately :- ");

        int n = sc.nextInt();
        int i=1;
        int sum1 = 0 ;
        int sum2 = 0;

        while(i<=n){
            if(i%2==0){
                sum1 += i;
            }
            else{
                sum2 +=i;
            }
            i++;
        }

        System.out.println("The sum of even integers in between 0 to " + n + " is :- " + sum1);
        System.out.println("The sum of odd integers in between 0 to " + n + " is :- " + sum2);
        sc.close();
    }
}
