//Invoice class
package servicestationpack;

public class Invoice {
	private Person customer, employee;
	private Vehicle vehicle;
	Invoice(Person cus, Person emp, Vehicle vehicle){
		customer = cus;
		employee = emp;
		this.vehicle = vehicle;
	}

	public String toDisplay(){
		return String.format("Customer: %s Employee: %s Vehicle: %s Total charge: $%d",customer.getName(), employee.getName(), vehicle.getName(), vehicle.getServiceCharge());
	}
};