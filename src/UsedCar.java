
public class UsedCar extends Car {
	// instance variable
	private double mileage;

	public UsedCar() {

	}

	// initiates the variables here because we are naming all of the elements in the
	// array list at the begining and will know the forma tthat infromation is
	// needed to be entered in
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}
	// override of the toString method from <Car>
	public String toString() {
		return String.format("%1$-10s %2$-10s %3$-6d $%4$-10.2f (Used)%5$-8.1f miles", super.getMake(),
				super.getModel(), super.getYear(), super.getPrice(), mileage);

	}
}
