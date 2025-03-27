package com;

public class VoteException extends Exception{
	// by default every sub class constructor contains super() without out knowlege 
	
	public VoteException() {
		super();			// it always call super class empty constructor 
	}
	public VoteException(String msg) {
		super(msg);			// we are calling parameter constructor to set the message
	}
}
