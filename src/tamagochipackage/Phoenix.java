package tamagochipackage;

public class Phoenix extends Animals {
	boolean canResurect = true;

	/**
	 * constructor of Phoenix set a height between 0.1 and 2 set health to 8
	 */
	public Phoenix() {
		int heighPhoenix = (int) (Math.random() * (20) + 1);
		double heightDoublePhoenix = (double) heighPhoenix / 10;
		this.setHeight(heightDoublePhoenix);
		this.setHealth(8);
		this.setHunger(8);
		this.setEnergy(8);

	}

	
	/**
	 * ascii art for phoenix
	 */
	@Override
	public void ascii() {
		System.out.println("   _,=\"( _  )\"=,_\r\n" + "_,'    \\_>\\_/    ',_\r\n" + ".7,     {  }     ,\\.\r\n"
				+ " '/:,  .m  m.  ,:\\'\r\n" + "   ')\",(/  \\),\"('\r\n" + "      '{'!!'}'+\n");
	}

	/**
	 * getter of resurect
	 * 
	 * @return boolean of resurect
	 */
	public boolean canResurect() {
		return (canResurect);
	}

	/**
	 * setter for resurect
	 * 
	 * @param canResurect
	 */
	public void setResurect(boolean canResurect) {
		this.canResurect = canResurect;
	}

	/**
	 * when my animals die,if he can resurect, do some action, like the health or
	 * the lifetime
	 */
	public void resurect() {
		this.setHealth(5);
		this.setLifeTime(10);
		this.setHunger(2);
	}

	/**
	 * return the value of the stats in form of a bar
	 */
	public String showBar(int valeursStats) {
		return ("||||||||".substring(0, valeursStats) + "********".substring(valeursStats, 8));
	}
	
	/**
	 * return the stats in a format string
	 */
	public String showStats() {
		return (super.showStats()+ "\n Mon estomac est remplie a " + this.getHunger() + " sur 8  "
				+ showBar(this.getHunger()) + "\n Ma barre de wc est a " + this.getWc() + "             "
				+ showBar(this.getWc()) + "\n Ma barre d'energie est a " + this.getEnergy() + " sur 8   "
				+ showBar(this.getEnergy()) + "\n Ma santé est a " + this.getHealth() + " sur 8             "
				+ showBar(this.getHealth()));
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
		String appearance = "\n Je suis un phoenix \n ma criniere est " + this.getHairColor();
		return (super.getAppearance() + appearance);
	}

}
