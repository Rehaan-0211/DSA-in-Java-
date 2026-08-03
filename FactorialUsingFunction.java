public class FactorialUsingFunction {
    public static double factorial(double n){
    double f = 1;

    for(double i =1; i<= n ; i ++){
        f = f * i;
    }

    return f;
}

public static void main(String[]args){
    double factorial = factorial(4);
    System.out.println("The value of factorial for given value is :- " + factorial);
}

}



