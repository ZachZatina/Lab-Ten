import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// Variable list
		Scanner scnr = new Scanner(System.in);
		String cont = "n";
		int userPick = 0;
		// creating the array list
		ArrayList<Object> carList = new ArrayList<>();
		carList.add(new Car("Ford", "Mustang", 2018, 29999.95));
		carList.add(new Car("Ford", "Fiesta", 2018, 17899.95));
		carList.add(new Car("Ford", "Explorer", 2018, 24799.95));
		carList.add(new Car("Ford", "F-150", 2018, 28999.95));
		carList.add(new UsedCar("Pontiac", "Torrent", 2007, 7500.00, 166500.0));
		carList.add(new UsedCar("Volkswagen", "Golf", 2001, 3500.00, 257000.0));
		carList.add(new UsedCar("Ford", "Ranger", 2004, 6000.00, 140000.4));
		carList.add(new UsedCar("Chevrolet", "Cavalier", 2002, 4499.95, 131650.0));
		carList.add("Quit");

		// loop to print out all the cars available
		for (int i = 0; i < carList.size(); i++) {
			System.out.println((i + 1) + ". " + carList.get(i));
		}
		System.out.println("");

		// loop to see if the user wants to choose this car and allows the user to re
		// choose the car if they dont want the first one they picked
		while (cont.equalsIgnoreCase("n")) {

			System.out.print("Which car would you like?: ");
			userPick = scnr.nextInt();
			scnr.nextLine();
			System.out.println(carList.get(userPick - 1));
			System.out.print("Would you like to buy this car? (y/n): ");
			cont = scnr.nextLine();

		}
		System.out.println("Excellent! Our finance department will be in touch with you shortly.");
		
		// loop to "delete" and replace the the car the user chooses
		for (int i = (userPick); i < carList.size(); i++) {
			carList.set((i - 1), carList.get(i));
		}
		// removes the last item on the list which would be a duplicate
		carList.remove(carList.size() - 1);

		System.out.println("");
		
		// loop to redisplay the infromation.
		for (int i = 0; i < carList.size(); i++) {
			System.out.println((i + 1) + ". " + carList.get(i));
		}
		
		scnr.close();
	}

}
