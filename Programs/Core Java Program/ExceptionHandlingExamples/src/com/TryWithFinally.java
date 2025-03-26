package com;

public class TryWithFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 100/0;
			System.out.println("no exception");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("normal statement");

	}

}
