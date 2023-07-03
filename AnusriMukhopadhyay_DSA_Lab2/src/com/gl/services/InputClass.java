package com.gl.services;
import java.util.Scanner;

public class InputClass{
	private Scanner sc;
	
	public int getIntValue() {
		sc = new Scanner(System.in);
		String value = sc.next();
		while(!isIntergerNumber(value) || Integer.parseInt(value) == 0) {
			System.out.println("Enter a valid number");
			value = sc.next();
		};
		return Integer.parseInt(value);
	}
	
	
	public static boolean isIntergerNumber(String strNum) {
	    boolean ret = true;
	    try {
	        Integer.parseInt(strNum);
	    }catch (NumberFormatException e) {
	        ret = false;
	    }
	    return ret;
	}

	public int getLongValue() {
		sc = new Scanner(System.in);
		String value = sc.next();
		while(!isLongNumber(value) || Long.parseLong(value) == 0) {
			System.out.println("Enter a valid number");
			value = sc.next();
		};
		
		return Integer.parseInt(value);
	}
	
	public static boolean isLongNumber(String strNum) {
	    boolean ret = true;
	    try {
	        Long.parseLong(strNum);
	    }catch (NumberFormatException e) {
	        ret = false;
	    }
	    return ret;
	}
}
