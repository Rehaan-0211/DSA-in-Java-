public class CheckIfTheNumberIsPrimeUsingFunctions {
    public static boolean Isprime(int n){
        if(n <= 1){
            System.out.println("Only use positive numbers greater than 1");
            return false;
        }
        
        if(n == 2){
            return true;
        }

        for(int i = 2;i*i<=n;i++){//i*i<=n works because after a certain value the numbers repeat itself so we dont need to go all the way to n-1.
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        boolean a = Isprime(1);
        System.out.println("Is it prime ? :- " + a);
    }
}
