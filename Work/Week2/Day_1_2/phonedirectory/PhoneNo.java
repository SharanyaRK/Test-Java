/* PhoneNo class */

package phonedirectory;

/* class to add phone number details */

public class PhoneNo{
	private String number, phoneTag;

	/* Constructor to initialize phine number */

	PhoneNo(String number, String phoneTag){
		this.number = number;
		this.phoneTag = phoneTag;
	}

	public String getNumber(){
		return number;
	}

	public String getTag(){
		return phoneTag;
	}
}