import java.util.*;

//Main class Employee
public class Employee{
	private String name;
	private int age;
	private double salary;
	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public int getAge(){
		return age;
	}

	Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String toDisplay(){
		return String.format("Name:%s Age:%d Salary:%f",name ,age ,salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean inputFlag = false;
		char userResponse;
		String name;
		double salary;
		int age;
		List<Employee> employeeList = new ArrayList<Employee>();
		do{
			System.out.println("Add employees>[y/n]");
			userResponse = sc.next().charAt(0);
			if (userResponse == 'y') {
				System.out.println("Enter the username:");
				name = sc.next();
				System.out.println("Age:");
				age = sc.nextInt();
				System.out.println("Salary:");
				salary = sc.nextDouble();
				employeeList.add(new Employee(name,age,salary));
			}
			else if (userResponse == 'n'){
				inputFlag = true;
			}
		}while(!inputFlag);

		//Anonymous class object for comparing names
		Comparator nameComparator = new Comparator(){
			public int compare(Object o1, Object o2){
				Employee emp1 = (Employee) o1;
				Employee emp2 = (Employee) o2;
				return emp1.getName().compareTo(emp2.getName());
			}
		};

		//Anonymous class object for comparing ages
		Comparator ageComparator = new Comparator(){
			public int compare(Object o1, Object o2){
				Employee emp1 = (Employee) o1;
				Employee emp2 = (Employee) o2;

				if(emp1.getAge() > emp2.getAge()){
					return 1;
				}
				else if(emp1.getAge() == emp2.getAge()){
					return 0;
				}
				else{
					return -1;
				}
			}
		};

		//Anonymous class object for comparing salaries
		Comparator salaryComparator = new Comparator(){
			public int compare(Object o1, Object o2){
				Employee emp1 = (Employee) o1;
				Employee emp2 = (Employee) o2;

				if(emp1.getSalary() > emp2.getSalary()){
					return 1;
				}
				else if(emp1.getSalary() == emp2.getSalary()){
					return 0;
				}
				else{
					return -1;
				}
			}
		};

		//Scan input and perform sort
		System.out.println("Sort by:");
		System.out.println("1.Name");
		System.out.println("2.Age");
		System.out.println("3.Salary");
		userResponse = sc.next().charAt(0);
		switch (userResponse) {
			case '1':{
				Collections.sort(employeeList,nameComparator);
				break;
			}
			case '2':{
				Collections.sort(employeeList,ageComparator);
				break;
			}
			case '3':{
				Collections.sort(employeeList,salaryComparator);
			}
		}

		//Displaying the output
		for(Employee employeeObject : employeeList){
			System.out.println(employeeObject.toDisplay());
		}

	}

}