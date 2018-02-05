import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Car car1 = new Car("Chevrolet", "Trax", 2018, 16550);
		Car car2 = new Car("BMW", "X3", 2018, 42650);
		Car car3 = new Car("Jeep", "Wrangler", 2018, 19000);
		UsedCar car4 = new UsedCar("Subaru", "Forester", 2015, 18000, 40000);
		UsedCar car5 = new UsedCar("Volkswagen", "Golf", 2006, 9000, 89000);
		UsedCar car6 = new UsedCar("Ford", "Escape", 2001, 3500, 230000);

		ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(car1, car2, car3, car4, car5, car6));
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(car1.getName(), car2.getName(), car3.getName(), car4.getName(), car5.getName(), car6.getName()));

		String keepGoing = "Y";
		do {
			System.out.println("Current car inventory: ");
			for (Car vehicle : carList) {
				System.out.println(vehicle);
			}

			String choice;
			do {
				System.out.println("Select a car by entering its make and model with a space between them & proper capitalization: ");
				choice = input.nextLine();			
			}while(!nameList.contains(choice));
			
			Car choiceObj = null;
			String gonnaPurch = null;

			for (Car vehicle : carList) {
				if (choice.equals(vehicle.getName())) {
					choiceObj = vehicle;
					System.out.printf("You have selected the %d %s costing $%.2f. ", vehicle.getYear(), vehicle.getName(), vehicle.getPrice());
					System.out.println("Would you like to purchase this vehicle? Enter Y or N: ");
					gonnaPurch = input.nextLine();		
				}
			}
			
			if (gonnaPurch.equalsIgnoreCase("N")) {
				System.out.println("Type \"cars\" to return to current car inventory or \"exit\" to leave: ");
				String ans = input.nextLine();
				if (ans.equalsIgnoreCase("exit")) {
					break;
				}
				else if (ans.equalsIgnoreCase("cars")) {
					continue;
				}	
			} 
			else if (gonnaPurch.equalsIgnoreCase("Y")) {
				carList.remove(choiceObj);
				nameList.remove(choice);
				System.out.printf("Excellent! Please send weekly Venmo payments of $2,999.99 or less to @carareaume until $%.2f has been paid off.", choiceObj.getPrice());
				System.out.println();
				System.out.println("Would you like to buy another car? Enter Y or N: ");
				keepGoing = input.next();
				input.nextLine();
			}
	
		} while (keepGoing.equalsIgnoreCase("Y"));

		System.out.println("Thanks for shopping!");
		input.close();
	}

}
