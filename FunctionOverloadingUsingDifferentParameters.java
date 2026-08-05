public class FunctionOverloadingUsingDifferentParameters {
    public static int sum (int a , int b){
        int sum = a + b;
        return sum;
    }

    public static float sum (float a ,float b){
        float sum = a + b;
        return sum; 
    }

    public static void main(String[] args){
        int sum = sum(5,89);
        float sum1 = sum(6.9f,67.9f);

        System.out.println("Sum is :- " + sum);
        System.out.println("Sum is :- " + sum1);
    }
}
