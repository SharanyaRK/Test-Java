//Program to calculate income tax for men and women seperately
//class TaxCalculator to calculate tax
class TaxCalculator {
	String name;
	double taxableincome;
	String gender;
	double tax;
 	public void getInput(String gName,double gtaxableincome,String ggender){
		name=gName;
		taxableincome=gtaxableincome;
		gender=ggender;
										}
//Function to compute tax for male gender
	public void computeDataMale() {
	
        	if (taxableincome <= 60000) {
        	    tax = 0;
       		 } 
		else if (taxableincome > 60000 && taxableincome <= 150000) {
            		tax = taxableincome * 0.05;
        	 } 
		else if (taxableincome >150000 && taxableincome <= 500000) {
            		tax = taxableincome * 0.1;
       	        } 
		else {
            		tax = taxableincome * 0.2;
               }
	}
//Function to calculate tax for female gender
	 public void computeDataFemale(){
		if (taxableincome <= 70000) {
            		tax = 0;
        	}
	       else if (taxableincome > 70000 && taxableincome <= 200000) {
            		tax = taxableincome * 0.05;
        	} 
		else if (taxableincome > 200000 && taxableincome <= 700000) {
            		tax = taxableincome * 0.1;
        	} 
		else {
           		 tax = taxableincome * 0.2;
        }
	
    }
 
//Function to display calculated tax

	void displayData() {
        	System.out.println("Display Data");
        	System.out.println("Name=" + name);
        	System.out.println("Taxable Income=" + taxableincome);
        	System.out.println("Tax Paid=" + tax);
    			   }
 	}
//main class 

class MainTaxCal{
	public static void main(String args[]){
        	TaxCalculator tc = new TaxCalculator();
		tc.getInput(" Sharanya " , 160000, " female ");
		tc.computeDataFemale();
		tc.displayData();
		tc.getInput(" Shannu " , 160000, " male ");
		tc.computeDataMale();
		tc.displayData();

    						}
}
