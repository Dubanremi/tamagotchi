package tamagochipackage;

public class Dragon extends Animals {

	/**
	 * constructor of dragon change the height for a double between 10 and 20 set
	 * health to 15
	 */
	public Dragon() {
		double heighDragon = (double) (Math.random() * (20 - 10) + 10);
		this.setHeight(heighDragon);
		this.setHealth(15);
		this.setEnergy(15);
		this.setHunger(15);
	}

	/**
	 * ascii art for dragon override is because my method in my parents is abstract
	 */
	@Override
	public void ascii() {
		System.out
				.println("              \\||/\r\n" + "                |  @___oo\r\n" + "      /\\  /\\   / (__,,,,|\r\n"
						+ "     ) /^\\) ^\\/ _)\r\n" + "     )   /^\\/   _)\r\n" + "     )   _ /  / _)\r\n"
						+ " /\\  )/\\/ ||  | )_)\r\n" + "<  >      |(,,) )__)\r\n" + " ||      /    \\)___)\\\r\n"
						+ " | \\____(      )___) )___\r\n" + "  \\______(_______;;; __;;;" + "\n");

	}

	/**
	 * get the askInfo() of Animals and add the scales color
	 */
	public void askInfo() {
		super.askInfo();// this code go copy the method askInfo of animals, and past here
		System.out.println("De quelle couleur sont mes écailles ?");
		this.setHairColor(sc.next());
	}

	/**
	 * get the getAppearance() of Animals and add the scale color
	 */
	public String getAppearance() {
		String appearance = "\n Je suis un dragon \n mes écailles sont " + this.getHairColor();
		return (super.getAppearance() + appearance);

	}

	/**
	 * for the dragon, he can have 15 of stats, so we need to adjust the showBar
	 * function
	 */
	public String showBar(int valeursStats) {
		return ("|||||||||||||||".substring(0, valeursStats) + "***************".substring(valeursStats, 15));
	}

	/**
	 * verify if the health don't exceed 15
	 */
	public void setHealth(int health) {
		super.setHealth(health);
		if (this.getHealth() > 14) {
			this.health = 15;
		}

	}

	/**
	 * return the stats in a format string
	 */
	public String showStats() {
		return (super.showStats() + "\n Mon estomac est remplie a " + this.getHunger() + " sur 15  "
				+ showBar(this.getHunger()) + "\n Ma barre de wc est a " + this.getWc() + "             "
				+ showBar(this.getWc()) + "\n Ma barre d'energie est a " + this.getEnergy() + " sur 15   "
				+ showBar(this.getEnergy()) + "\n Ma santé est a " + this.getHealth() + " sur 15             "
				+ showBar(this.getHealth()));
	}

	/**
	 * public function specific to dragon for regen health
	 */
	public void eatFire() {
		this.setLifeTime(this.getLifeTime() + 2);
	}

}
