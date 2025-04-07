package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseClassesExamples {

	public static void main(String[] args) throws Exception{
	// source --> keyboard 
	// destination --> console 
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("Enter the id");
//		int id = Integer.parseInt(br.readLine());
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		System.out.println("id is "+id);
//		System.out.println("Name is "+name);
		// source --> file 
		// destination --> file 
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("demo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}
		bw.flush();
		System.out.println("file copied");
		fr.close();
		fw.close();
	}

}
