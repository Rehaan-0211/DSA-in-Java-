public class PractiseProblem_0021 {
    public static boolean IsEven(int a){
        if(a%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        boolean Even = IsEven(6);
        System.out.println("Is it even :- " + Even);
    }
}
