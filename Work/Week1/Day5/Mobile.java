/* Class Mobile:
Members
-name : String
-remainingCharge : Integer
Methods:
+remainingCharge(): void
+name() : void
Create a list of mobiles overriding the remainingCharge() for each mobile(random value >0&<100). 
Print the mobile name and remaining charge. Use anonymous inner class for creating mobile objects. */

//Main class Mobile
import java.util.*;
public class Mobile{
	private String name;
	private int remainingCharge;
	//Constructor to initialize values
	Mobile(String name, int remainingCharge){
		this.name = name;
		this.remainingCharge = remainingCharge;
	}
	//function to print remaining charge
	public void remainingCharge(){
		System.out.println("Remaining charge: "+remainingCharge);
	}
	//function to display mobile brand
	public void name(){
		System.out.println("Name:"+name);
	}
	//main function 
	public static void main(String[] args) {
		List<Mobile> mobileList = new ArrayList<Mobile>();
		
		//Creating mobile objects using anonymous inner classes and overriding the functions, remainingCharge() and name()
		Mobile mobileObj1 = new Mobile("SAMSUNG",50){
			public void remainingCharge(){
				Random rand = new Random();
				int randomnNumber = rand.nextInt(99)+1;
				System.out.println("Remaining charge:" + randomnNumber);
			}
		};

		Mobile mobileObj2 = new Mobile("APPLE",40){
			public void remainingCharge(){
				Random rand = new Random();
				int randomnNumber = rand.nextInt(99)+1;
				System.out.println("Remaining charge:"+randomnNumber);
			}
		};

		Mobile mobileObj3 = new Mobile("NOKIA",20){
			public void remainingCharge(){
				Random rand = new Random();
				int randomnNumber = rand.nextInt(99)+1;
				System.out.println("Remaining charge:"+randomnNumber);
			}
		};

		mobileList.add(mobileObj1);
		mobileList.add(mobileObj2);
		mobileList.add(mobileObj3);

		for(Mobile mobileObj : mobileList){
			mobileObj.name();
			mobileObj.remainingCharge();
		}
	}
}