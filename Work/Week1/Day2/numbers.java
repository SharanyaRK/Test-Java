//Program to print largest and smallest number in an array

import java.util.*;
import java.lang.*;
import java.io.*;

//Main class to calculate largest and smallest number in an array

class numbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		//Scan array values
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
				     }
		int small=arr[0];
		int large=arr[0];
		//Calculating larger and smaller values
		for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>large)
					large=arr[i];
				else if(arr[i]<small)
					small=arr[i];
			}
		//Display values
		System.out.println(" Largest number: "+large);
		System.out.println(" Smallest number:"+small);
						}
		}