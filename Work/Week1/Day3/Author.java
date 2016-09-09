package Library;

//Class for author objects
class Author {
	private String name;
	private String email;
	private char gender;

	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	//Functions for retrieving data
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	//Functions for setting instance variables
	public void setEmail(String Email){
		email = Email;
	}
	public char getGender(){
		return gender;
	}

	//REturns the string to display for the author object
	public String toDisplay(){
		return String.format("%s(%c) at %s",name,gender,email);
	}

	//Main function for testing
	public static void main(String[] args) {
		Author authorObj = new Author("r.k narayan","r@gmail.com",'m');
		System.out.println(authorObj.toDisplay());
		authorObj.setEmail("new@gmail.com");
		System.out.println(authorObj.toDisplay());
	}
}