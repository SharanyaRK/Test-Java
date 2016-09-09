//Program to print the number of animals created

import java.util.Scanner;
import java.lang.*;

//class Animal to keep track the count of objects created

class Animal{
	public static int count;
	//Constructor to count object 
	 Animal()
		{	
			System.out.println("A new animal has been created");
			count++;
			System.out.println(" Number of objects created: " + count);
		}
	}

//Main class 
class AnimalClass{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String str1= "yes";
	String input;
	do{
		Animal animal=new Animal();
		System.out.print("Enter yes to continue or no to quit:");
		input=sc.nextLine();
	  }while(str1.equals(input));		
						}
	}