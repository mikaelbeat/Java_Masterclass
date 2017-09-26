
public class Variable_Types {

	public static void main(String[] args) {
		
		// int has a width of 32.
		int minValue = -2_147_483_648;
		int maxValue = 2_147_483_647;
		
		// byte has a width of 8.
		byte minByteValue = -128;
		byte maxByteValue = 127;
		// Casting, defining new variable as byte
		byte newByteValue  = (byte) (maxByteValue/2);
		
		// short has width of 16.
		short minShortValue = -32_768;
		short maxShortValue = 32_767;
		
		// long has widht of 64.
		long minLongValue = -9_223_372_036_854_775_808L;
		long maxLongValue =  9_223_372_036_854_775_807L;
	}

}
