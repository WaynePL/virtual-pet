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
	public VirtualPet(String name) {
		// The pet is now alive. This means the loop should start
		this.name = name;
	}

	public void feed() {
		if (hunger > 50) {
			hunger -= 50;
		} else {
			hunger = 0;

		}
		thirst += 20;
		waste += 20;
	}

	public void water() {
		if (thirst > 50) {
			thirst -= 50;
		} else {
			thirst = 0;
		}
		waste += 20;
	}

	public void play() {
		boredom -= 30;
	}

	public void sleep() {
		tiredness = 0;
	}

	public void waste() {
		waste = 0;
	}

	public void vet() {
		sickness = 0;
	}

	public void clean() {
		messes -= 1;
	}

	public void tick(int action) {
		System.out.println("This is a tick. things are happening and progressing.");
		if (action != 1) {
			hunger += 10;
		}
		if (action != 2) {
			thirst += 10;
		}
		if (action != 3) {
			boredom += 10;
		}
		if (action != 4) {
			tiredness += 10;
		}
		if (action != 5 && waste != 100) {
			waste += 10;
		} else if (waste == 100) {
			waste -= 50;
			messes += 1;
		}

	}

	public boolean isAlive() {
		return false;
	}
}
