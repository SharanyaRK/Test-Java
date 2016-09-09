/* program to find the summation of indices of the characters in given input is odd or even. Indices start from 1(for a) to 26(for z).
Input: abc
Output: even (1+2+3 =6)*/

import java.io.*;
import java.util.Scanner;

//Main class to calculate indices 

class indices{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int index=0;
		// Loop to calculate indices value
		for(int i=0;i<str.length();i++)
			{
				index+=arr[i]-48;
			}
		if(index%2==0)
			System.out.println(" even " );
		else
			System.out.println(" odd ");
						}
	     }