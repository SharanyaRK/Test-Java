//Program to find smallest power of x greater tahn y

import java.util.Scanner;
import static java.lang.Math.pow;

//Main class xpower to calculate the smallest power of x greater than y

class xpower{
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int i;
	for(i=0;i<y;i++){
		int power=(int)pow(x,i);
		//If the power value found greater than y break the loop
		if(power>y)
		{
			System.out.println(" smallest power of " + x + " is : " + i);
			break;
		}
			}
}

}