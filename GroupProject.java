package com.syntax.class11;

import java.util.Scanner;

public class GroupProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------Task 1--------");
//create a 2D array of integer values. print the sum of all numbers.
		
		int sArry[][] = { { 1, 2 }, { 3, 4 }, };
		int sum = 0;
		for (int i = 0; i < sArry.length; i++) {
			for(int j=0; j<sArry[0].length; j++) 
				
			
			sum += sArry[i][j];
		}
		System.out.println("Total = " + sum);
		
	
		
		System.out.println("-------Task 2--------");
/*
 * Create a 2D array or integer type where you will store odd and even numbers. 
 * Develop a program which will identify/print the even numbers only.
 */
		int[][] arr = { { 1, 2, 3, 4 }, { 11, 22, 33, 44 }, { 101, 202, 333, 444 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0;j< 4; j++) {
				if (arr[i][j]%2==0)
				System.out.println(arr[i][j]);
			}
			}
		
		
		System.out.println("-------Task 3--------");
/*
 * Create a 2D array of integers. Develop a program which will calculate the sum of 
 * even and odd numbers for that array.
 */
			int[][] twoDArray= {
					{1,2,3,4,5},
					{5,6,7,8,9},
					{4,5,6,7,8}
			};
			
			int sumE=0;
			int sumO=0;
			for (int r=0; r<twoDArray.length; r++){
			  for (int c=0; c<twoDArray[r].length; c++){
			  if (twoDArray[r][c]%2 ==0){
			   	
			sumE+=twoDArray[r][c];
			  } else {
			  	sumO+=twoDArray[r][c];
			  }
			  }
			}
			System.out.println("sum of all even numbers in twoDArray is " +sumE);
			System.out.println("sum of all odd numbers in twoDArray is " +sumO);
		
		System.out.println("-------Task 4--------");
//Write a program to swap 2 numbers without a temporary variable.
		
		int a=10;
		int b=20;
		
		System.out.println("-----before swapping-----");
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		
		System.out.println("-------after swapping------");
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
		
		System.out.println("-------Task 5--------");
// write a java program to check whether a given number is prime or not.

		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
	        for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}

		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
		
		
		System.out.println("-------Task 6--------");
//write a java program to print the first ten numbers of the Fibonacci series.
		int n1=0,n2=1,n3 = 0,i;
		System.out.print(n1+ " "+n2);
		for(i=2;i<10;++i) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.print(" "+n3);

		System.out.println("-------Task 7--------");
//find the maximum and minimum number in the array.
		int[] num3 = { 9, 25, 4, 7, 90, 95 };
		int smallest= num3[0];
		
		for (int c=1; c<num3.length;c++) {
			if (num3[c]<smallest) {
				smallest=num3[c];
			}
		}
		System.out.println(smallest);
	     
	
	int largest = num3[0];
	
	for (int v=1; v<num3.length;v++) {
		if (num3[v]>largest) {
			largest=num3[v];
		}
	}
	System.out.println(largest);

		System.out.println("-------Task8---------");
//write a java program to find the second largest number in the array.
		int largestt = 0;
		int secondLargest = 0;
		int[] num1 = { 55, 77, 88, 100 };
		for (int k = 1; i < num1.length; i++) {
			if (num1[k] > largestt) {
				secondLargest = largestt;
				largestt = num1[k];
			} else if (num1[k] > secondLargest) {
				secondLargest = num1[k];
			}
		}
		System.out.println("The 2nd largest number is: " + secondLargest + ".");
		
		
	} }


