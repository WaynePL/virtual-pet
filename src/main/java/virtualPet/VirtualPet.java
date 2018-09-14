package virtualPet;

public class VirtualPet {

	// These are the types of pets that can be chosen
	static final String DOG = "1";

	String name;
	int hunger = 0;
	int thirst = 0;
	int waste = 0;
	int boredom = 0;
	int sickness = 0;

	// This is the constructor.
	public VirtualPet(String name, String animal) {
		// The pet is now alive. This means the loop should start
		this.name = name;
		if (animal.equals("1")) {

		}
	}

	// this is the main display
	public void display() {

	}

	public void tick() {
		System.out.println("This is a tick. things are happening and progressing.");
	}

	public boolean isAlive() {

	}
}
