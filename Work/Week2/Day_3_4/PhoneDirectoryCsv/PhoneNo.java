
package phonedirectory;

/* Class PhoneNo to access phoneNo details */

public class PhoneNo{
	private String number, phoneTag;
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
