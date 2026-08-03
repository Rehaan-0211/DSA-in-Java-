public class FunctionOverloading {
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static int sum(int a,int b,int c){
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args){
        int sum = sum(3,4);
        int sum1 = sum(7,5,6);

        System.out.println("Value for first input :- " + sum);
        System.out.println("Value for second input :-" + sum1);
    }
}
