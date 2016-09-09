//Program to calculate Simple and Compound interest

import java.util.Scanner;
import java.lang.Math.*;

//Main class to calculate interest

class interest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter principal: ");
		int principal=sc.nextInt();
		System.out.println(" enter rate of interest: ");
		int rate=sc.nextInt();
		System.out.println(" enter the number of years:");
		int years=sc.nextInt();
		
		//Funtion call to calculate simple interest
		simpleInterest(principal,rate,years);

		//Function call to calculate compound interest
		compoundInterest(principal,rate,years);
						}

	public static void simpleInterest(int principal,int rate,int years){
		System.out.println("Simple Sum:"+ (principal*rate*years));
										}

	public static void compoundInterest(int principal,int rate,int years){
		System.out.println("Compound Sum:"+ (int)			(principal*((Math.pow((1+rate),years)-1))));
										}

	   }