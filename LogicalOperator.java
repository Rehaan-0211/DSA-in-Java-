import java.util.*;
public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println((3>0) && (5>3)); 
        System.out.println((3<0) && (5>3)); 
        System.out.println((3>0) && (5<3));
        System.out.println((3<0) && (5<3)); //LOGICAL AND OPERATOR
        System.out.println((3>0) || (5>3));
        System.out.println((3<0) || (5>3)); 
        System.out.println((3>0) || (5<3));
        System.out.println((3<0) || (5<3)); //LOGICAL OR OPERATOR
        System.out.println(!(3>0));
        System.out.println(!(3<0)); //LOGICAL NOT OPERATOR
    }
}
