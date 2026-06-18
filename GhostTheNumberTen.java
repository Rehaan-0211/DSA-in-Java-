import java.util.*;
public class GhostTheNumberTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number :-  ");
        int i = sc.nextInt();

        do{
            if(i % 10 == 0){
                continue;
            }
            System.out.println("The number is " + i);
        }while(true);
        
    }
}
 //To be honest brooo i don't know what was the point of this code but i don't know i did it for the sake of the lore.</3 THE SC ISNT CLOSING PEAK RAGEBAIT SHOULD I USE BREAK INSTEAD...nvm this code is much of a tradegy already let's leave.
 