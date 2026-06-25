// Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;
public class PractiseProblem_0012{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input a year value and i'll tell if it's a leap year or not :- ");
        int year = sc.nextInt();

        if (year%4 == 0){
            if(year%100 != 0){
                System.out.println("Its a leap year!");
            }
            else{
                if(year%400 == 0){
                    System.out.println("Its a leap year!"); 
                }
                else{
                    System.out.println("Not a leap year!");
                }
            }
        }
        else{
            System.out.println("Not a leap year!");
        }
        sc.close();
    }
}