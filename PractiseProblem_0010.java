//(Conditional Statement phase) Question 2 :- Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.*;
public class PractiseProblem_0010 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your body temprature :- ");

        double temp = sc.nextDouble();

        if(temp>=110.5){
            System.out.println("Pray to god bro 😂🙏📿");
        }
        else if(temp>=103.5 && temp <110.5){
            System.out.println("You have a fever..get it checked before it gets worse");
        }
        else if(temp>=90 && temp <103.5){
            System.out.println("You are healthy. Go to the gym.");
        }
        else if(temp>=85 && temp <90){
            System.out.println("Your body is going cold get it checked or evacuate to a warmer spot immediately if you don't wanna be a icecube");
        }
        else{
            System.out.println("You are so cool that you gonna die broo 😔");
        }
        sc.close();
    }
}

// i know i did too much more than what the question asked but it was fun