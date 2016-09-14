/**
* Person class
*/

package phonedirectory;
import java.util.*;

/* class Persont to add Person details */

public class Person{

	private String name, address;
	private ArrayList<PhoneNo> phoneNoList;

	/* Constructor to initialize variable */

	Person(String name, String address, ArrayList<PhoneNo> phoneNoList){
		this.name = name;
		this.address = address;
		this.phoneNoList = new ArrayList<PhoneNo>(phoneNoList);
	}

	public String getName(){
		return name;
	}

	public ArrayList<PhoneNo> getPhoneNoList(){
		return phoneNoList;
	}

	/* Function to return the string to be displayed */

	public String toDisplay(){

		String displayString = "";
		displayString = displayString + "Name:" + name + "\nAddress: " + address + "\nPhone numbers:";

		for(PhoneNo phoneNoObj : phoneNoList){
			displayString = displayString + phoneNoObj.getNumber()+"("+phoneNoObj.getTag()+") ";
		}

		return displayString;
	}
};