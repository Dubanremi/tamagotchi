package tamagochipackage;

public class Trolls extends Animals {

	/**
	 * constructor of trolls set a height between 1 and 10 set health to 12
	 */
	public Trolls() {
		int heighTrolls = (int) (Math.random() * (100) + 10);
		double heighTrollsDouble = heighTrolls / 10;
		this.setHeight(heighTrollsDouble);
		this.setHealth(12);
	}

	/**
	 * get the askInfo() of Animals and add the hair color
	 */
	public void askInfo() {
		super.askInfo();
		System.out.println("De quelle couleur sont mes cheveux ?");
		this.setHairColor(sc.next());
	}

	/**
	 * get the getAppearance() of Animals and add the mane color
	 */
	public String getAppearance() {
		String appearance = "\n Je suis un trolls \n mes cheveux sont " + this.getHairColor();
		return (super.getAppearance() + appearance);
	}

	/**
	 * function specific to trolls, increase the energy and set humor to happy
	 */
	public void fightThings() {
		this.setHumor(2);
		this.setEnergy(this.getEnergy() + 1);
	}
}
