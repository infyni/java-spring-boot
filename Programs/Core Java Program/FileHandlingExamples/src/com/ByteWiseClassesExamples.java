package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseClassesExamples {

	public static void main(String[] args) throws Exception{
	// source --> keyboard 
	// target --> console 
//	DataInputStream dis = new DataInputStream(System.in);// keyboard 	
//	PrintStream ps = System.out;					// console 
//	ps.println("Enter the text");
//	String msg = dis.readLine();
//	System.out.println(msg);
		
		
		// source --> keyboard 
		// target --> file 
//		DataInputStream dis = new DataInputStream(System.in);// keyboard 	
//		//FileOutputStream fos = new FileOutputStream("abc.txt");  // store in file : override the data 
//		FileOutputStream fos = new FileOutputStream("abc.txt",true);  // append the data 
//		System.out.println("Enter the data");
//		int ch;
//		while((ch=dis.read())!='@') {
//			System.out.print(ch+" "+(char)ch);
//			fos.write(ch);
//		}
//		fos.close();
//		System.out.println("file created");
		
//		// source -->file 
//		// target --> file 
//		FileInputStream fis = new FileInputStream("D:\\Maven Plugins.txt");
//		FileOutputStream fos = new FileOutputStream("info.docx");
//		int ch;
//		while((ch=fis.read()) != -1) {		// -1 = EOF
//			fos.write(ch);
//		}
//		fis.close();
//		fos.close();
//		System.out.println("file copy");
		
				// source -->file with buffer concept  
				// target --> file with buffer concept 
				FileInputStream fis = new FileInputStream("D:\\Maven Plugins.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("infobuffer.docx");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				int ch;
				while((ch=bis.read()) != -1) {		// -1 = EOF
					bos.write(ch);
				}
				fis.close();
				fos.close();
				System.out.println("file copy");
	}

}
