package virtualPet;

import org.junit.Assert;
import org.junit.Test;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Virtual;

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
	public void wasteShouldNotBe100() {
		VirtualPet pet = new VirtualPet("R");
		pet.waste = 100;
		pet.tick(1);
		boolean not100 = pet.waste == 100;
		Assert.assertEquals(false, not100);
	}

	@Test
	public void shouldNotBeSickByThirst() {
		VirtualPet pet = new VirtualPet("R");

		pet.thirst = 90;
		pet.tick(2);

		Assert.assertEquals(0, pet.sickness);
	}

	@Test
	public void shouldAlsoIncreaseMess() {
		VirtualPet pet = new VirtualPet("R");
		pet.waste = 80;
		pet.feed();
		pet.tick(1);
		Assert.assertEquals(1, pet.messes);
	}

	@Test
	public void shouldBeAlive() {
		VirtualPet pet = new VirtualPet("R");
		pet.sickness = 0;
		boolean alive = pet.isAlive();
		Assert.assertEquals(true, alive);
	}

	public void shouldBeSick() {
		VirtualPet pet = new VirtualPet("R");
		pet.hunger = 100;
		pet.tick(0);
		boolean sick = pet.sick;
		Assert.assertEquals(true, sick);
	}

	@Test
	public void shouldNotBeSick() {
		VirtualPet pet = new VirtualPet("R");
		pet.sick = true;
		pet.tick(6);
		boolean sick = pet.sick;
		Assert.assertEquals(false, sick);
	}

	@Test
	public void hungerShouldBe100() {
		VirtualPet pet = new VirtualPet("R");
		pet.hunger = 100;
		pet.tick(2);
		Assert.assertEquals(100, pet.hunger);
	}

	@Test
	public void thirstShouldBe100() {
		VirtualPet pet = new VirtualPet("R");
		pet.thirst = 100;
		pet.tick(1);
		Assert.assertEquals(100, pet.thirst);
	}

}
