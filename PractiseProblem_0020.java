//compute the avg of three numbers
public class PractiseProblem_0020{
    public static int Avg(int a,int b,int c){
        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args){
        int avg = Avg(6,7,8);
        System.out.println("The averageof three numbers is " + avg);
    }
}