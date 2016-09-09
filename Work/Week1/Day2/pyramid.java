//Number pattern printing program

import java.util.Scanner;

//Main class to print number pyramid pattern

class pyramid{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int rowCount=1;
		for(int i=rows;i>0;i--)
			{
				//Printing i*2 spaces at the beginning of each row
				for(int j=1;j<=i*2;j++)
					{System.out.print(" ");}

				//Printing j where j value will be from 1 to rowCount
				for(int j=1;j<=rowCount;j++)
					{System.out.print(j+" ");}
				
				//Printing j where j value will be from rowCount-1 to 1
				for(int j=rowCount-1;j>=1;j--)
					{System.out.print(j+" ");}

				System.out.println();

				rowCount++;
			}
						}
}