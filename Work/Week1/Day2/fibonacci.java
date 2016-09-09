//Program to calculate fibonacci of n numbers

import java.util.Scanner;

//Main class to calculate fibonacci

class fibonacci{
	public static void main(String args[]){
		//Variable declaration and initialization
		int first=0,second=1,next;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value:");
		int n=sc.nextInt();
		//Calculating fibonacci values and displaying
		for(int i=2;i<=n;i++) {
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
					}
						}
		}