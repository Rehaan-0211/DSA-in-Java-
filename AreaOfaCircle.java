import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner (System.in);
        float rad = sc.nextInt();
        float area = (float) (Math.PI * rad * rad);
        System.out.println(area);
        sc.close();
    }
}

