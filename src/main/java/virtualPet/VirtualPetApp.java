package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the virtual pet store.");

		System.out.println("Please name your pet:");

		String name = input.nextLine();
		VirtualPet pet = new VirtualPet(name);

		while (pet.isAlive()) {
			System.out.println("Animal noise");
			// This should be a statement about how your pet is feeling or how it's
			// responding to what you just did
			display(pet);
			String choiceString = userInterface(pet.name);
			int choice = 0;
			try {
				choice = Integer.parseInt(choiceString);
			} catch (Exception e) {
				System.out.println("You did not enter a number, please try again");
				continue;
			}

			switch (choice) {
			case "1":
				pet.feed();
				break;
			case "2":
				pet.water();
				break;
			case "3":
				pet.play();
				break;
			case "4":
				pet.sleep();
				break;
			case "5":
				pet.waste();
				break;
			case "6":
				pet.vet();
				break;
			default:
				System.out.println("Please enter a number between 1 - 6");
				continue;
			}
			pet.tick(choice);
		}

	}

	static String userInterface(String name) {
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to do? (Enter the number of the action)");
		System.out.println();
		System.out.println("1. Feed " + name);
		System.out.println("2. Water " + name);
		System.out.println("3. Play with " + name);
		System.out.println("4. Put " + name + "to sleep");
		System.out.println("5. Take " + name + " out.");
		System.out.println("6. Take " + name + " to the vet.");
		System.out.println();
		String choice = input.nextLine();
		return choice;
	}

	static void display(VirtualPet pet) {

		System.out.println(pet.name);
		System.out.println("Hunger: " + pet.hunger);
		System.out.println("Thirst: " + pet.thirst);
		System.out.println("Bathroom: " + pet.waste);
		System.out.println("Boredom: " + pet.boredom);
		System.out.println("Sickness: " + pet.sickness);
	}
}
