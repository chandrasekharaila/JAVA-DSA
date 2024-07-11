package DAY1;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // byte a = 127; // byte range is from -128 to 127
        short b = Short.MIN_VALUE;
        short c = Short.MAX_VALUE;
        byte d = Byte.MAX_VALUE;
        byte e = Byte.MIN_VALUE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.printf("The range of byte is from %d to %d\n", e, d);
        System.out.printf("The range of short data types is from %d to %d\n", b, c);
        System.out.printf("The range of Integer is from %d to %d\n", minInt, maxInt);
        System.out.printf("The range of Long is from %d to %d\n", minLong, maxLong);
        System.out.printf("The range of float is from %f to %e\n", minFloat, maxFloat);
        System.out.printf("The range of double is from %f to %E", minDouble, maxDouble);

    }
}
