package com;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte a=10;		// -128 to 127
		short b=a;		// implicit type casting 
		
		
		short c=10;
		byte d = (byte)c;		// explicit type casting 
		//
		//int age = 21;
		//byte age = 21;
		long l = 9875656486l;	// explicit type casting 
		int m = (int)l;				//explicit type casting 
		float f = 10.0f;		// explicit type casting 
		float f1 = 10;		// implicit type casting 
	}

}
