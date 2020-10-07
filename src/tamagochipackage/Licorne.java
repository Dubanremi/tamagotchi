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
		this.setHunger(8);
		this.setEnergy(8);
	}

	/**
	 * ascii art for unicorn
	 */
	@Override
	public void ascii() {
		System.out.println("`\\\r\n" + "  \\\\,\r\n" + "   \\\\\\,^,.,,.\r\n" + "   ,;7~((\\))`;;,,\r\n"
				+ "   ,(@') ;)`))\\;;',\r\n" + "    )  . ),((  ))\\;,\r\n" + "   /;`,,/7),)) )) )\\,,      ,,,... ,\r\n"
				+ "  (& )`   (,((,((;( ))\\,_,,;'`    `\\\\,\r\n" + "   `\"    ` ), ))),/( (            `)\\,\r\n"
				+ "          '1/';/;  `               ))),\r\n" + "           (, (     /         )    ((/,\r\n"
				+ "          / \\                /     ((('\r\n" + "         ( 6--\\%  ,>     ,,,(     /'))\\'\r\n"
				+ "          \\,\\,/ ,/`----~`\\   \\    >,))))'\r\n" + "            \\/ /          `--7>' /((((('\r\n"
				+ "            (,9             // /'('((\\\\\\,\r\n"
				+ "             \\ \\,,         (/,/   '\\`\\\\'\\\r\n"
				+ "              `\\_)1         (_)     `\\`\\\\`\\\r\n"
				+ "                `\\|         \\Z          `\\\r\n" + "                  `          \"            `"
				+ "\n");
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
		return (super.showStats() + "\n Mon estomac est remplie a " + this.getHunger() + " sur 8  "
				+ showBar(this.getHunger()) + "\n Ma barre de wc est a " + this.getWc() + "             "
				+ showBar(this.getWc()) + "\n Ma barre d'energie est a " + this.getEnergy() + " sur 8   "
				+ showBar(this.getEnergy()) + "\n Ma santé est a " + this.getHealth() + " sur 8             "
				+ showBar(this.getHealth()));
	}
/**
 * Unicorn cant have cleanliness at false
 */
	public void setCleanliness(boolean cleanliness) {
		this.cleanliness = cleanliness;
		if (!this.isCleanliness()) {
			this.cleanliness = true;
			System.out.println("Je suis une licorne, je suis tout le temps propre");
			System.out.println("Donc ma propreté est repasser a propre.");
		}
	}

}
