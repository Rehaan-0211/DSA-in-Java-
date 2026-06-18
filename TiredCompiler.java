import java.util.*;
public class TiredCompiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a multiple of 10 and the compiler rests..or else he will get angry cause bro been working for 10 hours atp :-  ");
        do{
            int input = sc.nextInt();
            if(input % 10 == 0){
                break;
            }

            System.out.println("You're gay fr don't know maths?"); 
        }while(true);
        System.out.println("Finally m gonna have a good sleep now...says the poor compiler..but little does that poor soul know...Rehaan is not yet satisfied.");
        sc.close();
    }
}
