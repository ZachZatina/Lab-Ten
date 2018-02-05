
public class Car {
	// instance variables
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car() {
		
	}
	//initializing the variables to what information is entered in main
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	// to string method to print out formatted strings of information from the array list
	public String toString() {
		return String.format("%1$-10s %2$-10s %3$-6d $%4$-10.2f", make, model, year, price);
	}
}
