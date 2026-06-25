// (Loops phase) Question 4 :- Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;
public class PracriseProblem_0015 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value for which you would like a multiplication table for(upto 10) :- ");

        int n = sc.nextInt();
        int i = 1;
        int prdt = 1;

        while(true){
            if(i!=11){
            prdt = (n*i);
            System.out.println(n+"x"+i+"="+prdt);
            i++;
        }
        else{
            break;
        }
        }
        sc.close();
    }
}

//chatgpt said that my code is more complicated then it should be..i agree but i built it myself so i think its finee i can later for sure maybe make it lighter but i still did it myself with my own thought process so yea it's a w. But ill try to make my code more efficient.