
public class UsedCar extends Car { //inheritance!
	double mileage = 0;
	
	public UsedCar() { //default constructor
		
	}
	
	//constructor with five args with mileage last
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	//start getters/setters
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	//end getters/setters
	
	@Override
	public String toString() {
		//return "Make: " + super.getMake() + "\t" + "Model: " + model + "\t" + "Year: " + year + "\tPrice: $" + price + "\t" + "Mileage: " + mileage;
		return String.format("USED: Make: %-15s \t Model: %-15s \t Year: %-15d \t Price: $%-15.2f \t Mileage: %-15.2f", make, model, year, price, mileage);
	}
	
	

}
