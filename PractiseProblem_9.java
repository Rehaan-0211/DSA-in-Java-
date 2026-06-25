//(Conditional Statement phase) Question 1 :- Write a Java p rogram to get a number from the user and print whether it is positive or negative.

import java.util.*;
public class PractiseProblem_9 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the number to check wheather its negative or positive :- ");

        double input = sc.nextDouble();

        if(input<0){
            System.out.println("The number you have mentioned is negative");
        }
        else if (input > 0){
            System.out.println("The number you have mentioned is positive");
        }
        else{
            System.out.println("The number is zero..neither positive nor negative");
        }
        sc.close();
    }
}
