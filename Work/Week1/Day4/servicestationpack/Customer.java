//Customer class inherits from person
package servicestationpack;

public class Customer extends Person{
	private String customerId;
	Customer(String name, String contact, int age, String customerId){
		super(name, contact, age);
		this.customerId = customerId;
	}

	public String toDisplay(){
		return String.format("%s %s %d %s",name ,contact ,age ,customerId);
	}

};