package tamagochipackage;

public class Licorne extends Animals {

	/**
	 * constructor of unicorn set a height between 1 and 4, set health to 8
	 */
	public Licorne() {
		int heighLicorne = ((int) (Math.random() * (40) + 10));
		double heightLicorneDouble = heighLicorne / 10;
		this.setHeight(heightLicorneDouble);
		this.setHealth(8);
	}

	/**
	 * get the askInfo() of Animals and add the mane color
	 */
	public void askInfo() {
		super.askInfo();
		System.out.println("De quelle couleur est ma criniere ?");
		this.setHairColor(sc.next());
	}

	/**
	 * get the getAppearance() of Animals and add the mane color
	 */
	public String getAppearance() {
		String appearance = "\n Je suis une licorne \n ma criniere est " + this.getHairColor();
		return (super.getAppearance() + appearance);

	}

}
