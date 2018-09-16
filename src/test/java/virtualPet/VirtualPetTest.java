package virtualPet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldIncreaseMess() {
		VirtualPet pet = new VirtualPet("R");
		pet.waste = 100;
		pet.tick(1);
		Assert.assertEquals(1, pet.messes);
	}

	@Test
	public void shouldNotIncreaseMess() {
		VirtualPet pet = new VirtualPet("R");
		pet.waste = 90;
		pet.tick(1);
		Assert.assertEquals(0, pet.messes);
	}

	@Test
	public void shouldAlsoIncreaseMess() {
		VirtualPet pet = new VirtualPet("R");
		pet.waste = 80;
		pet.feed();
		pet.tick(1);
		Assert.assertEquals(1, pet.messes);
	}
}
