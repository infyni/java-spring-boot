package com;

public class OperatorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div  = a/b;
		System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
		System.out.println("mul is "+mul);
		System.out.println("div is "+div);
		int n=10;
		int m;
		m=n;
		System.out.println("n"+n);			// 10 
		System.out.println("m"+m);         // 10
		m=n++;		// post increment 			first store then increment 
		System.out.println("n"+n);			// 11
		System.out.println("m"+m);          //10 
		m=++n;		// pre increment 		// increment and store 
		System.out.println("n"+n);			// 12
		System.out.println("m"+m);           // 12
	}

}
