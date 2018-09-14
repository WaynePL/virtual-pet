package virtualPet;

public class VirtualPet {

	boolean isAlive = true;

	// This is the constructor.
	public VirtualPet() {
		// The pet is now alive. This means the loop should start
		status();
	}

	public void status() {

		while (isAlive) {
			System.out.println("Animal noise");

		}
	}

	// this is the main display
	public void display() {

	}

	public void tick() {
		System.out.println("This is a tick. things are happening and progressing.");
	}
}
