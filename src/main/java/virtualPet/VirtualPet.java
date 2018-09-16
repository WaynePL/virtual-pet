package virtualPet;

public class VirtualPet {

	String name;
	int hunger = 0;
	int thirst = 0;
	int waste = 0;
	int boredom = 0;
	int tiredness = 0;
	int sickness = 0;
	int messes = 0;
	String species = "";

	// This is the constructor.
	public VirtualPet(String name, String animal) {
		// The pet is now alive. This means the loop should start
		this.name = name;
		switch (animal) {
		case "1":
			species = "Dog";

		}
	}

	public void feed() {
		if (hunger > 50) {
			hunger -= 50;
		} else {
			hunger = 0;

		}
		thirst += 20;
	}

	public void water() {
		thirst -= 10;
	}

	public void play() {
		boredom -= 10;
	}

	public void sleep() {
		tiredness -= 50;
	}

	public void vet() {
		sickness -= 50;
	}

	public void clean() {
		messes -= 1;
	}

	public void tick() {
		System.out.println("This is a tick. things are happening and progressing.");

	}

	public boolean isAlive() {
		return false;
	}
}
