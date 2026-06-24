// (Operator phase) Question 3 :- Dry run the following code

public class PractiseProblem_6 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}

// SO according to my evaluation the answer must be x=4,y=0 and z=2 anddd....im wrong for value of z. Ill check why...(after checking) OKAY so i thought z /= (x + y); is equal to (x+y)/z but it is actually z/(x+y) and since the datatype is int so the value of 2/4 will come out as 0.