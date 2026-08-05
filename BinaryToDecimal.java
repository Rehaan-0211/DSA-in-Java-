public class BinaryToDecimal {
    public static int binTodec(int BinNum){
        int dec = 0;
        int pow = 0;
        while(BinNum>0){
            int lastdigit = BinNum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));//typecasting
            pow++;
            BinNum = BinNum / 10;
        }
        return dec;
    }

    public static void main(String[] args){
        int decimal = binTodec(101);
        System.out.println("Value in decimal for the given Binary Number is = " + decimal);
    }
}
