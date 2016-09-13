//Employee class inherits from person
package servicestationpack;

public class Employee extends Person{
	private String empId;
	Employee(String name, String contact, int age, String empId){
		super(name, contact, age);
		this.empId = empId;
	}

	public String toDisplay(){
		return String.format("%s %s %d %s",name ,contact ,age ,empId);
	}
};