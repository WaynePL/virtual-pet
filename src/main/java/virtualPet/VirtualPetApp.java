package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the virtual pet store.");

		System.out.println("Please name your pet:");

		String name = input.nextLine();
		VirtualPet pet = new VirtualPet(name);

		gameLoop(name, pet);
	}

	private static void gameLoop(String name, VirtualPet pet) {
		while (pet.isAlive()) {
			display(pet);
			String choiceString = userInterface(pet.name);
			int choice = 0;
			try {
				choice = Integer.parseInt(choiceString);
			} catch (Exception e) {
				System.out.println("You did not enter a number, please try again");
				continue;
			}

			choiceSwitch(name, pet, choice);
			pet.tick(choice);
		}
		System.out.println("Unfortunately, " + name + " has passed away due to illness");
	}

	private static void choiceSwitch(String name, VirtualPet pet, int choice) {
		System.out.print("----");
		switch (choice) {
		case 1:
			System.out.print("You give " + name + " some food.");
			pet.feed();
			break;
		case 2:
			System.out.print("You give " + name + " some water");
			pet.water();
			break;
		case 3:
			System.out.print("You take " + name + " out for a walk.");
			pet.waste();
			break;
		case 4:
			System.out.print("You take " + name + " to the vet.");
			pet.vet();
			break;
		case 5:
			System.out.print("You clean " + name + "'s mess.");
			pet.clean();
			break;
		default:
			System.out.print("Please enter a number between 1 - 6");
			break;
		}
		System.out.println("----");
	}

	static String userInterface(String name) {
		Scanner input = new Scanner(System.in);
		System.out.println("+--------------------------------------------------------+");
		System.out.println("|What do you want to do? (Enter the number of the action)");
		System.out.println("|");
		System.out.println("|1. Feed " + name);
		System.out.println("|2. Water " + name);
		System.out.println("|3. Take " + name + " out.");
		System.out.println("|4. Take " + name + " to the vet.");
		System.out.println("|5. Clean up a mess.");
		System.out.println("+--------------------------------------------------------+");
		String choice = input.nextLine();
		return choice;
	}

	static void display(VirtualPet pet) {

		System.out.println(pet.name);
		System.out.println("Hunger: " + pet.hunger);
		System.out.println("Thirst: " + pet.thirst);
		System.out.println("Bathroom: " + pet.waste);
		System.out.println("Sickness: " + pet.sickness);
		System.out.println("Messes: " + pet.messes);
	}
}
