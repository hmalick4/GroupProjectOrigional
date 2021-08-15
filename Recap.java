package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] twoDArray= { {10,20}, {1,2,3}, {100, 200, 300}}; //all declaration must happen at the same time. 
		
		int howManyArrays=twoDArray.length;
		System.out.println(howManyArrays);
		
		System.out.println(twoDArray[0].length);
		
		///to print entire array using enhanced for loop
		for(int [] arr:twoDArray) {
			for(int num:arr) {
				System.out.println(num+" ");
			}
			System.out.println();
			}
		//to print entire array using for loop
		for(int r=0; r<twoDArray.length; r++) { //outer looks over every array
			for(int c=0; c<twoDArray[0].length; c++) //checks the elements in the array
				
				System.out.println(twoDArray[r][c]+ " ");
		}
		System.out.println();
		}
jlhj look this over		
		}
	


