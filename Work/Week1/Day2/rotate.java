//Program rotate given matrix left or right

import java.util.Scanner;

//Main class to rotate the given matrix

class rotate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] array=new int[row][col];
		//Scan array values
		for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
					{
	  					array[i][j]=sc.nextInt();
					}
			}
		//Function call to rotate matrix by right
		rightRotate(row,col,array);
		//Funciton call to rotate matrix by left
		leftRotate(row,col,array);
	   }
		//Function to rotate matrix right
		public static void rightRotate(int row,int col,int[][] array){

		for(int i=0;i<row;i++)
			{
				for(int j=i+1;j<col;j++)
					{
						int temp=array[i][j];
						array[i][j]=array[j][i];
						array[j][i]=temp;
					}
			}
		for(int i=0;i<row;i++)
			{
				for(int j=0;j<col/2;j++)
					{
						int temp=array[i][j];
						array[i][j]=array[i][col-1-j];
						array[i][col-1-j]=temp;
					}
			}

		System.out.println();
		//Loop to print matrix after right rotation
		for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
					{
					  System.out.print(array[i][j]+" " );
					}
	 			 System.out.println();
			}

		}

//Funtion to rotate matrix by left
public static void leftRotate(int row,int col,int[][] array){

	for(int i=0;i<row/2;i++)
		{
			for(int j=i;j<col-i-1;j++)
				{
					int temp=array[i][j];
					array[i][j]=array[row-j-1][i];
					array[row-j-1][i]=array[row-i-1][row-j-1];
					array[row-i-1][row-j-1]=array[j][row-i-1];
					array[j][row-i-1]=temp;
				}
		}
	System.out.println();

	for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				{
	 				 System.out.print(array[i][j]+" " );
				}
	  		System.out.println();
		}
								}

}