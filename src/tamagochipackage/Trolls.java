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
		this.setHunger(12);
		this.setEnergy(12);
	}

	/**
	 * ascii art for Trolls
	 */
	@Override
	public void ascii() {
		System.out.println("             ,      ,\r\n" + "            /(.-\"\"-.)\\\r\n" + "        |\\  \\/      \\/  /|\r\n"
				+ "        | \\ / =.  .= \\ / |\r\n" + "        \\( \\   o\\/o   / )/\r\n"
				+ "         \\_, '-/  \\-' ,_/\r\n" + "           /   \\__/   \\\r\n" + "           \\ \\__/\\__/ /\r\n"
				+ "         ___\\ \\|--|/ /___\r\n" + "       /`    \\      /    `\\\r\n"
				+ "      /       '----'       \\" + "\n");
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
	 * return the value of the stats in form of a bar
	 */
	public String showBar(int valeursStats) {
		return ("||||||||||||".substring(0, valeursStats) + "************".substring(valeursStats, 12));
	}
	
	/**
	 * return the stats in a format string
	 */
	public String showStats() {
		return (super.showStats()+ "\n Mon estomac est remplie a " + this.getHunger() + " sur 12  "
				+ showBar(this.getHunger()) + "\n Ma barre de wc est a " + this.getWc() + "             "
				+ showBar(this.getWc()) + "\n Ma barre d'energie est a " + this.getEnergy() + " sur 12   "
				+ showBar(this.getEnergy()) + "\n Ma santé est a " + this.getHealth() + " sur 12             "
				+ showBar(this.getHealth()));
	}
	/**
	 * function specific to trolls, increase the energy and set humor to happy
	 */
	public void fightThings() {
		this.setHumor(2);
		this.setLifeTime(this.getLifeTime() + 1);
	}
}
