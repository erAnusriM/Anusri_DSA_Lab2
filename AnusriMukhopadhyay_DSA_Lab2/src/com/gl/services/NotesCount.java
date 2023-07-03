package com.gl.services;

public class NotesCount {
	
	public void getNotesCount(int[] notes, int amount) {
		// TODO Auto-generated method stub
		int noteCounter[] = new int[notes.length];
		try {
			for(int i=0; i<notes.length; i++) {
				if(amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				} else {
					noteCounter[i] = 0;
				}
			}
			if(amount > 0) {
				System.out.println("Cannot make payment with the given higher denominations");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int j=0; j< notes.length; j++) {
					if(noteCounter[j] > 0) {						
						System.out.print(notes[j] + ":" + noteCounter[j]);
						System.out.println();
					}
				}
				System.out.println();
			}
		} catch(ArithmeticException e) {
			System.out.println(e + "Division by zero");
		}
		
	}

}
