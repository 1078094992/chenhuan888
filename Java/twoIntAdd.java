package de.vogella.eclipse.ide.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twoIntAdd {
	public static void main(String[] args){
	int one =0;
	int two =0;
	String temp= null;
	System.out.println("please enter the year:");
	try{
		BufferedReader year=new BufferedReader(new InputStreamReader(System.in));
		temp=year.readLine();
		one=Integer.parseInt(temp);
		System.out.println("please enter the month:");
		BufferedReader year1=new BufferedReader(new InputStreamReader(System.in));
		temp=year1.readLine();
		two=Integer.parseInt(temp);
		}catch(IOException e){
			e.printStackTrace();
		}
	System.out.println(one+"+"+two+"="+(one+two));

	}

}
