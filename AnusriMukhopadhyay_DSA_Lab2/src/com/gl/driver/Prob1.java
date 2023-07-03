package com.gl.driver;
import com.gl.services.*;

public class Prob1 {
	static int tranSize;
	static int tranArr [];
	static int noTarget;
	
	public static void main(String[] args) {
		
		InputClass inputClass = new InputClass();
		System.out.println("enter the size of transaction array ");
		tranSize  = inputClass.getIntValue();
		tranArr = new int[tranSize];
		System.out.println("enter the values of array ");
		for(int i =0 ; i< tranSize ; i++) {
			tranArr[i] = inputClass.getIntValue();
		}
		System.out.println("enter the total no of targets that needs to be achieved ");
		noTarget = inputClass.getIntValue();
		
		for(int j=0; j< noTarget ; j++) {
			System.out.println("enter the value of target");
			long target = inputClass.getLongValue();
			TransactionServiceImpl ts = new TransactionServiceImpl();
			ts.search(tranArr, target);
		}
	}
}
