package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the virtual pet store.");
		String animal = "";
		boolean animalGiven = false;
		while (!animalGiven) {
			System.out.println("Please pick your pet: (Enter the number to select the pet)");
			System.out.println("1. Dog");
			animal = input.nextLine();
			if (!animal.equals("1")) {
				System.out.println("Please pick an animal from the list.");
			} else {
				animalGiven = true;
			}
		}
		System.out.println("Please name your pet:");

		String name = input.nextLine();
		VirtualPet pet = new VirtualPet(name, animal);

		while (pet.isAlive()) {
			System.out.println("Animal noise");
			// This should be a statement about how your pet is feeling or how it's
			// responding to what you just did
			display(pet);
			String action = userInterface(pet);
			pet.tick();
			switch (action) {
			case "1":
				pet.feed();
				break;
			case "2":
				pet.water();
				break;
			case "3":

			}

		}

	}

	static String userInterface(VirtualPet pet) {
		String name = pet.name;
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to do? (Enter the number of the action)");
		System.out.println();
		System.out.println("1. Feed " + name);
		System.out.println("2. Water " + name);
		System.out.println("3. Play with " + name);
		System.out.println("4. Put " + name + "to sleep");
		System.out.println("5. Do nothing");
		System.out.println();
		return input.nextLine();
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
