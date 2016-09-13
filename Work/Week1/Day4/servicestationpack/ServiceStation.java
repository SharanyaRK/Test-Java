/*
Program description:
Service Station (name, address, contact) 
Person - Employee/Customer (name, age, contact, emp_id) - an employee can also be a customer.
Vehicle - brand, color, service  (Car, Bike, Bus, service_charge)
Invoice (name_of_owner,vehicle, amount_total, employee_assigned)
List the service charges of all the vehicles that can get repaired in the station. List all the employee and customer (can also be an employee) with their invoices.
*/

package servicestationpack;
import java.util.*;

//Main class ServiceStation

public class ServiceStation {
	private String name,address,contact;
	private ArrayList<Employee> employeesList;
	private ArrayList<Customer> customerList;
	private ArrayList<Invoice> invoiceList;
	private ArrayList<Vehicle> vehicleList;

	ServiceStation(String name, String address, String contact){
		this.name = name;
		this.address = address;
		this.contact = contact;
		employeesList = new ArrayList<Employee>();
		customerList = new ArrayList<Customer>();
		invoiceList = new ArrayList<Invoice>();
		vehicleList = new ArrayList<Vehicle>();
	}

	public void listAllcustomers(){
		for(Customer customerObj : customerList){
			System.out.println(customerObj.toDisplay());
		}
	}

	public void listAllEmployees(){
		for(Employee employeeObj : employeesList){
			System.out.println(employeeObj.toDisplay());
		}
	}

	public void listAllVehicles(){
		for(Vehicle vehicleObj : vehicleList){
			System.out.println(vehicleObj.toDisplay());
		}
	}

	public void listAllInvoices(){
		for(Invoice invoiceObj : invoiceList){
			System.out.println(invoiceObj.toDisplay());
		}
	}

	public void addEmployee(Employee emp){
		employeesList.add(emp);
	}

	public void addCustomer(Customer cus){
		customerList.add(cus);
	}

	public void addInvoice(Invoice inv){
		invoiceList.add(inv);
	}

	public void addVehicle(Vehicle v){
		vehicleList.add(v);
	}

	
	public static void main(String[] args) {

		//Creating serviceStation object
		ServiceStation serviceStationObj = new ServiceStation("servicename","serviceadd","123456");
		
		//Creating employee objects, adding to the serviceStation object
		Employee employeeObj1 = new Employee("A","123",20,"1");
		Employee employeeObj2 = new Employee("B","456",21,"2");
		Employee employeeObj3 = new Employee("C","789",22,"3");
		serviceStationObj.addEmployee(employeeObj1);
		serviceStationObj.addEmployee(employeeObj2);
		serviceStationObj.addEmployee(employeeObj3);

		//Creating customer objects,adding to the serviceStation object
		Customer customerObj1 = new Customer("D","456",30,"4");
		Customer customerObj2 = new Customer("E","789",31,"5");
		Customer customerObj3 = new Customer("F","345",32,"6");
		serviceStationObj.addCustomer(customerObj1);
		serviceStationObj.addCustomer(customerObj2);
		serviceStationObj.addCustomer(customerObj3);

		//Creating vehicle objects,adding to the serviceStation object
		Vehicle vehicleObj1 = new Vehicle("car", 100);
		Vehicle vehicleObj2 = new Vehicle("bike",200);
		Vehicle vehicleObj3 = new Vehicle("bus", 300);
		serviceStationObj.addVehicle(vehicleObj1);
		serviceStationObj.addVehicle(vehicleObj2);
		serviceStationObj.addVehicle(vehicleObj3);
		
		//Creating invoice objects using existing employee,customer and vehicle objects
		Invoice invoiceObj1 = new Invoice(customerObj1, employeeObj1, vehicleObj1);
		Invoice invoiceObj2 = new Invoice(employeeObj2, customerObj2, vehicleObj2);
		Invoice invoiceObj3 = new Invoice(customerObj3, employeeObj3, vehicleObj3);
		serviceStationObj.addInvoice(invoiceObj1);
		serviceStationObj.addInvoice(invoiceObj2);
		serviceStationObj.addInvoice(invoiceObj3);
		
		//Testing functions of serviceStation object		
		serviceStationObj.listAllEmployees();
		serviceStationObj.listAllcustomers();
		serviceStationObj.listAllVehicles();
		serviceStationObj.listAllInvoices();


	}
};