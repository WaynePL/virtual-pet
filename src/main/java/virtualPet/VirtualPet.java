package virtualPet;

public class VirtualPet {

	String name;
	int hunger = 0;
	int thirst = 0;
	int waste = 0;
	int sickness = 0;
	int messes = 0;
	String species = "";
	boolean sick;

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
		if (thirst < 80) {
			thirst += 20;
		} else {
			thirst = 100;
		}
		if (waste < 80) {
			waste += 20;
		} else {
			waste = 100;
		}
	}

	public void water() {
		if (thirst > 50) {
			thirst -= 50;
		} else {
			thirst = 0;
		}
		if (waste < 80) {
			waste += 20;
		} else {
			waste = 100;
		}
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
		if (action != 1) {
			if (hunger >= 90) {
				hunger = 100;
			} else {
				hunger += 10;
			}
		}
		if (action != 2) {
			if (thirst >= 90) {
				thirst = 100;
			} else {
				thirst += 10;
			}
		}
		if (action != 3 && waste != 100) {
			if (waste >= 90) {
				waste = 100;
			} else {
				waste += 10;
			}
		} else if (waste == 100) {
			waste -= 50;
			messes += 1;
		}
		if (action == 4) {
			sick = false;
			sickness = 0;
		}
		if (hunger == 100 || thirst == 100 || sick) {
			sick = true;
			sickness += 20;
		}

	}

	public boolean isAlive() {
		if (sickness >= 100) {
			return false;
		}
		return true;
	}
}
