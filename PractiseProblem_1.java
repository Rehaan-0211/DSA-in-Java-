
//So this is a note to self or i don't know this may help you all out too? I have been practising DSA but i did not solve any question related to the topics at all and i think i made a mistake cause if i did my concept for each of the topics in this DSA journey would've been 100% efficient..so yea i dont know if anyone is gonna read this but do solve as many questions as possible man don't make the mistake i did. Lets get started w out question now so the question is:-
//Question1:In a program,input 3 numbers:A,BandC.You have t output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;

public class PractiseProblem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of the three numbers you want to find the average of :-");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c)/ 3;
        System.out.println("The average of the three given numbers will be :- " + average);
        sc.close();
    }
    
}
