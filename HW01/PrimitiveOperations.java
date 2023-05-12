
public class PrimitiveOperations {
	public static void main(String[] args) {
		int myInt = 69;
		float myFloat = 4.20F;
		System.out.println(myInt);
		System.out.println(myFloat);
		
		float multiPly = myInt * myFloat;
		System.out.println(multiPly);
		
		float intFloat = (float)myInt;
		System.out.println(intFloat);
		
		int floatInt = (int)myFloat;
		System.out.println(floatInt);
		
		char myChar = 'J';
		System.out.println(myChar);
		
		char myCharLower = (char)((int)myChar + 32);
		System.out.println(myCharLower);
	}
}
