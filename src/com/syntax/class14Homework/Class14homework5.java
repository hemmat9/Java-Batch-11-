package com.syntax.class14Homework;

public class Class14homework5 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?

			String [] sentence="I love Java classes".split(" ");
			
			String rev=" ";
			
			for (int i=sentence.length-1;i>=0;i--) {
				String word =sentence[i];
				rev+=sentence+" ";
				System.out.print(sentence [i]+ " ");
			}
		}
		
	}


