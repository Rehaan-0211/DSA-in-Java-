//(Variable section) Question 3 :-Enter cost of 3 items from the user (using float data type)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
import java.util.*;
public class PractiseProblem_0003 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the cost of the pencil :- ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen :- ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser :- ");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser ;
        float totalbill = bill * 1.18f;
        System.out.println("Your total bill including 18% gst is :- " + totalbill);
        sc.close();
    }
}
