
public class Main {

	public static void main(String[] args) {
		
		// int has a width of 32.
		int MinValue = -2_147_483_648;
		int MaxValue = 2_147_483_647;
		
		// byte has a width of 8.
		byte MinByteValue = -128;
		byte MaxByteValue = 127;
		// Casting, defining new variable as byte
		byte NewByteValue  = (byte) (MaxByteValue/2);
		
		// short has width of 16.
		short MinShortValue = -32_768;
		short MaxShortValue = 32_767;
		
		// long has widht of 64.
		long MinLongValue = -9_223_372_036_854_775_808L;
		long MaxLongValue =  9_223_372_036_854_775_807L;
	}

}
