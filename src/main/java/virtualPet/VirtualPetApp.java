package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the virtual pet store.");
		System.out.println("Please name your pet:");

		String name = input.nextLine();
		VirtualPet pet = new VirtualPet(name);

		while (pet.isAlive) {
			System.out.println("Animal noise");
			// This should be a statement about how your pet is feeling or how it's
			// responding to what you just did
			display(pet);
			pet.tick();

			if (pet.hunger <= 0) {
				isAlive = false;
			}
		}

	}

	public void display(VirtualPet pet) {
		System.out.println(pet.name);
		System.out.println("Hunger: " + pet.hunger);
		System.out.println("Thirst: " + pet.thirst);
		System.out.println("Bathroom: " + pet.waste);
		System.out.println("Boredom: " + pet.boredom);
		System.out.println("Sickness: " + pet.sickness);
	}
}
