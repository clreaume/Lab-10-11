import java.util.ArrayList;

public class CarLot {
	
	ArrayList<Car> lot = new ArrayList<Car>();

	public ArrayList<Car> getLot() {
		return lot;
	}

	public void setLot(ArrayList<Car> lot) {
		this.lot = lot;
	}

	public void setLot(Car first, Car second, Car third, Car fourth, Car fifth, Car sixth) {
		lot.add(first);
		lot.add(second);
		lot.add(third);
		lot.add(fourth);
		lot.add(fifth);
		lot.add(sixth);
	}
	
	public void setLot(Car first) {
		lot.add(first);
	}
	
	public void setLot(Car first, Car second) {
		lot.add(first);
		lot.add(second);
	}
	
	//to add vehicle to lot
	public void add(Car toAdd) {
		lot.add(toAdd);
	}
	
	//to remove vehicle from lot
	public void delete(Car toRemove) {
		lot.remove(toRemove);
	}
	
	//look up car in given position
	public Car lookUp(int idx) {
		return lot.get(idx);
	}
	
	//replace car in given position
	public void replaceCar(int idx, Car replaceWith) {
		lot.set(idx, replaceWith);
	}
	
	//ERROR: SAYS CANNOT CAST CAR INTO USEDCAR
//	public String deets(String name) {
//		UsedCar currentObj = null;
//		for (Car i : lot) {
//			if (name.equals(i.getName())){
//				currentObj = (UsedCar) i;
//				break;
//			}
//		}
//		return String.format("The %s costs $%.2f and has %.2f miles.", name, currentObj.getPrice(), currentObj.getMileage());
//	}
	
	public String deets(String name) {
		Car currentObj = null;
		for (Car i : lot) {
			if (name.equals(i.getName())){
				currentObj = i;
				break;
			}
		}
		return String.format("The %s costs $%.2f", name, currentObj.getPrice());
	}
	
	
	//to list all cars
	public void printLot() {
		System.out.println("Current inventory: ");
		for (Car i : lot) {
			System.out.printf("%s (%d)", i.getName(), i.getYear());
			System.out.println();
		}
			
	}

	
	
	//use this in CarLotApp
	//ArrayList<Car> cars = new ArrayList<Car>();
	
	
	

}
