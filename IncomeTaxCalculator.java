import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        int tax;
        if (income <= 250000){
            tax = 0;
            System.out.println("uhmmm yeaa no tax for you");
        }
        else if (income > 250000 && income <= 500000){
            tax = (int) (0.05 * income);
            System.out.println("Not so lucky anymore HAAHAHAHAHAH 5% tax for you");
        }
        else if (income > 500000 && income <= 1000000){
            tax = (int )(0.2 * income);
            System.out.println("Keep it coming government loves you mwah");
        }
        else{
            tax = (int)(0.3*income);
            System.out.println("You definitely love the government and want to give them more money...30% tax for you");
        }
        System.out.println("The tax amount is: " + tax);
        sc.close();
    }
}
