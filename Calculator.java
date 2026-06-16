import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of A be a good girl:");
        int A = sc.nextInt();

        System.out.println("Enter the value of B love...you are doing so good:");
        int B = sc.nextInt();

        System.out.println("You have been a good girl so far...now choose your favourite operator (+, -, *, /, %):");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*' :
                System.out.println(A*B);
                break;
            case '/' :
                if (B != 0 ) {
                    System.out.println(A/B);
                }
                else {
                    System.out.println("Gng are we five or what you can't divide by zero...its okay dw try again");
                }
                break;
            case '%' :
                if (B!=0) {
                    System.out.println(A%B);
                }
                else {
                    System.out.println("Babe atp come over ill give you some strict private math tution at home");
                }
                break;
            default : System.out.println("Somethings wrong here babe try again.");
                }
                System.out.println("DONT MIND THE CODE GUYS M JUST KIDDING..maybe");
                }
                
        }
   