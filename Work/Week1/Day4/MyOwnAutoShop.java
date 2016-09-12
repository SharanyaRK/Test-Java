// Base class Car

class Car{
	private int speed;
	private double regularPrice;
	private String color;
	Car(int speed,double regularPrice,String color){
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	public double getSalePrice(){
		return regularPrice;
	}

};

//sub classes extending Car

class Truck extends Car{
	private int weight;
	Truck(int weight,int speed,double regularPrice,String color){
		super(speed,regularPrice,color);
		this.weight = weight;
	}
	public double getSalePrice(){
		if(weight>2000)
			return super.getSalePrice()*(double)0.90;
		else
			return super.getSalePrice()*(double)0.80;
	}
};

class Ford extends Car{
	private int year,manufacturerDiscount;
	Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	public double getSalePrice(){
		return super.getSalePrice() - manufacturerDiscount;
	}
};

class Sedan extends Car{
	private int length;
	Sedan(int length, int speed, double regularPrice, String color){
		super(speed, regularPrice, color);
		this.length = length;
	}
	public double getSalePrice(){
		if(length > 20)
			return super.getSalePrice() * (double)0.95;
		else
			return super.getSalePrice() * (double)0.90;
	}
};

//Main class 
public class MyOwnAutoShop{
	public static void main(String[] args) {
		
		//Creating vehicle objects and testing them
		Sedan sedanObj = new Sedan(10, 100, 200, "black");
		System.out.println(sedanObj.getSalePrice());
		Ford fordObj = new Ford(20, 100, "blue", 2000, 200);
		System.out.println(fordObj.getSalePrice());
		Truck truckObj = new Truck(3000, 300, 800, "yellow");
		System.out.println(truckObj.getSalePrice());
	}
}