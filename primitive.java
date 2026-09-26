import java.math.BigInteger;    // used for very large number
public class primitive {
    public static void main(String[] args) {

        BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
        long valong = bigval.longValue();
        System.out.println("\nConvert the said BigInteger to an long value: "+valong);
        int val_Int = bigval.intValue();
		System.out.println("\nConvert the said BigInteger to an int value: "+val_Int);
        short val_Short = bigval.shortValue();
        System.out.println("\nConvert the said BigInteger to an short value: "+val_Short);
        byte val_Byte = bigval.byteValue();
        System.out.println("\nConvert the said BigInteger to byte: "+val_Byte);
        long val_ExactLong = bigval.longValueExact();
		System.out.println("\nConvert the said BigInteger to exact long: "+val_ExactLong);
    }
    
}
