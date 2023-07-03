package com.gl.driver;
import com.gl.services.*;

public class Prob2 {
	private static int currDenom;
	private static int denomArr[];
	private static int pay;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputClass inputClass = new InputClass();
		System.out.println("enter the size of currency denominations ");
		currDenom = inputClass.getIntValue();

		System.out.println("enter the currency denominations value ");
		denomArr = new int[currDenom];
		for(int i=0; i<denomArr.length; i++) {
			denomArr[i] = inputClass.getIntValue();
		}
		
		System.out.println("enter the amount you want to pay ");
		pay = inputClass.getIntValue();
		HelperClass hc = new HelperClass();
		int sortedArray[] = hc.bubbleSort(denomArr);
			
		NotesCount nc = new NotesCount();
		nc.getNotesCount(sortedArray, pay);
	}
}
