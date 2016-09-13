//Vehicle class
package servicestationpack;

public class Vehicle{
	private String name;
	private int serviceCharge;

	Vehicle(String name, int serviceCharge){
		this.name = name;
		this.serviceCharge = serviceCharge;
	}
	public String getName(){
		return name;
	}
	public int getServiceCharge(){
		return serviceCharge;
	}
	public String toDisplay(){
		return String.format("%s %d",name , serviceCharge);
	}
};