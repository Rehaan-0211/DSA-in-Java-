public class BinaryCoefficient {
    public static int binocoeff(int n, int r){
        int f =1;int g =1;int h =1;

        for(int i = 1;i<=n;i++){
            f = f * i;
        }

        for(int i =1;i<=r;i++){
            g = g * i;
        }

        for(int i =1;i<=(n-r);i++){
            h = h * i;
        }

        int Binocoeff = f / (g * h);
        return Binocoeff;
    }

    public static void main(String[]args){
        int BinaryCoefficient = binocoeff(5,2);
        System.out.println("Binary Coefficient for the given values is :- "+ BinaryCoefficient);
    }
}
