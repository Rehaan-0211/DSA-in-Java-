public class TypeConversion {
    
    public static void main(String[] args)
    {
        int a =10;
        long b = a; // implicit type conversion (widening)
        // long a -> int b (narrowing) - not allowed without explicit casting
        System.out.println(b);
    }
}
