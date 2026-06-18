
// NOT GONNA LIE I LOVED THIS ONEEE FOR REAL THE LOGIC I LEARNED TODAY MADE ME HAPPY!
import java.util.*;

public class CheckIfTheNumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number and my intelligent compiler will tell you if its prime or nah :-  ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("The number is prime");
        } else {
            boolean IsPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
        sc.close();
    }
}
// ALRIGHT THE SQRT N CONCEPT IS SO GOATED LIKE BRO..you know like for example you have number 12..soo u will have possible outcomes like 1x12,2x6,3x4,4x3,6x2,12x1...fair? Now for a small value it doesn't matter the compiler can easily just go ahead and check em all...but in case of bigger numbers like 200000 it does make a difference....so we pull out this eureka deserving concept where n = sqrtn + sqrt n so basically what happens here is that whenever we want to find out if the number is prime if we use i<= sqrt n instead of n-1...instead of the loop running n-2 times it will run sqrt n times....WHICH IS SO SLOW LIKE BEFORE U WERE CHECKING 1x12,2x6,3x4,4x3,6x2,12x1 now u check 1x12,2x6,3x4..ISNT THAT SO COOL THAT IS LIKE THE GOAT I LOVED THIS CONCEPT.
//alright just a slight correction sqrt n + sqrt n != n alright my bad but the factor concept is true MAN I LOVED THIS ONE THIS MADE MY DAY I LOVE THIS CODE <333333333333333333333333333333333333333333