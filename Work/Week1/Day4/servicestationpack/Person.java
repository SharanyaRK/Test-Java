package servicestationpack;

//class Person

public class Person{
	protected int age;
	protected String name,contact;
	Person(String name, String contact, int age){
		this.name = name;
		this.contact = contact;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
};