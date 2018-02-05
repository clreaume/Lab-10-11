import java.util.Scanner;

public class CarLotApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Car first = new Car("Chevrolet", "Trax", 2018, 16550);
		Car second = new Car("BMW", "X3", 2018, 42650);
		Car third = new Car("Jeep", "Wrangler", 2018, 19000);
		Car fourth = new UsedCar("Subaru", "Forester", 2015, 18000, 40000);
		Car fifth = new UsedCar("Volkswagen", "Golf", 2006, 9000, 89000);
		Car sixth = new UsedCar("Ford", "Escape", 2001, 3500, 230000);

		CarLot caraslot = new CarLot();
		caraslot.setLot(first, second, third, fourth, fifth, sixth);

		System.out.println("Welcome to Cara's Car Lot!");

		String ans;
		do {
			caraslot.printLot();
			System.out.println();

			System.out.println("Select a car by typing its make & model with proper capitalization: ");
			String choice = input.nextLine();
			System.out.println(caraslot.deets(choice));

			System.out.println("Want to hear about another car? Enter Y or N: ");
			ans = input.next();
		} while (ans.equalsIgnoreCase("Y"));

		System.out.println("Thanks for visiting!");

	}

}
