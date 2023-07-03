package com.gl.services;

public class TransactionServiceImpl {

	public void search(int arr[], long target) {
		long sum = 0;
		boolean flag = true;
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
			if(sum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Given target is not achieved");
		}
	}
}
