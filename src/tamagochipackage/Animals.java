package tamagochipackage;

import java.util.Scanner;

public class Animals {
	public Scanner sc = new Scanner(System.in);
	private String name;
	private double height;
	private String color;
	private int lifeTime;
	private String hairColor;
	private int hunger = 10;
	private int wc = 0;
	private int energy = 10;
	private int humor;// 1=pas content,2= content,3= soulagé
	private int health = 10;
	boolean masque = true;
	boolean cleanliness = true;

	public Animals() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the lifeTime
	 */
	public int getLifeTime() {
		return lifeTime;
	}

	/**
	 * @param lifeTime the lifeTime to set
	 */
	public void setLifeTime(int lifeTime) {

		this.lifeTime = lifeTime;
		if (this.getLifeTime() == 0) {
			this.setHealth(0);
		}else if (this.getLifeTime()<5) {
			System.out.println("Attention, il ne vous reste que "+this.getLifeTime()+" actions.");			
		}
	}

	/**
	 * @return the hairColor
	 */
	public String getHairColor() {
		return hairColor;
	}

	/**
	 * @param hairColor the hairColor to set
	 */
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	/**
	 * @return the hunger
	 */
	public int getHunger() {
		return hunger;
	}

	/**
	 * @param hunger the hunger to set
	 */
	public void setHunger(int hunger) {
		this.hunger = hunger;
		if (this.getHunger() == 0) {
			System.out.println("Je suis littéralement mort de faim .");
			this.setHealth(0);
		}else if (this.getHunger()<3) {
			System.out.println("J'ai faim ");
		}
	}

	/**
	 * @return the wc
	 */
	public int getWc() {
		return wc;
	}

	/**
	 * @param wc the wc to set
	 */
	public void setWc(int wc) {
		this.wc = wc;
		if (this.getWc()>6) {
			System.out.println("Attention, je dois aller au toilette");
		}
	}

	/**
	 * @return the energy
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to set
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
		if (this.getEnergy()<4) {
			System.out.println("Attention, je suis fatigué");
		}
	}

	/**
	 * @return the humor
	 */
	public int getHumor() {
		return humor;
	}

	/**
	 * @param humor the humor to set
	 */
	public void setHumor(int humor) {
		this.humor = humor;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
		if (this.getHealth()<4) {
			System.out.println("Attention, je n'ai presque plus de vie");
		}

	}

	/**
	 * @return the masque
	 */
	public boolean isMasque() {
		return masque;
	}

	/**
	 * @param masque the masque to set
	 */
	public void setMasque(boolean masque) {
		this.masque = masque;
	}

	/**
	 * @return the cleanliness
	 */
	public boolean isCleanliness() {
		return cleanliness;
	}

	/**
	 * @param cleanliness the cleanliness to set
	 */
	public void setCleanliness(boolean cleanliness) {
		this.cleanliness = cleanliness;
	}

	public void askInfo() {

		System.out.println("nommez moi ?");
		this.setName(sc.nextLine());

		System.out.println("De quel couleur je suis ?");
		this.setColor(sc.nextLine());

		System.out.println("dans combien de temps je dois mourir ? (en nombre d'action)");
		this.setLifeTime(sc.nextInt());
	}

	public void eat() {

		this.setHunger(10);
		this.setHealth(this.getHealth() + 1);
		this.setHumor(2);
		doAction(0, 0, 1);

	}

	/**
	 * 
	 */
	public void goToToilet() {

		this.setHumor(3);
		doAction(-1, -1, 0);

	}

	public void sleep() {
		this.setEnergy(10);
		this.setHumor(2);
		doAction(0, -1, 1);

	}

	public void dyeHair() {
		System.out.println("quel nouvelle couleurs voulez vous ?");
		String newHairColor;
		do {
			newHairColor = sc.next();
		} while (newHairColor.getClass().equals("String"));
		this.setHairColor(newHairColor);
		doAction(-1, -1, 1);

	}

	public void smoke() {
		this.setHealth(getHealth() - 1);
		doAction(-1, -2, 1);

	}

	public void haveSex() {

		this.setHumor(2);
		this.setCleanliness(false);
		doAction(-1, -1, 1);

	}

	public void hangOut() {

		this.setHumor(2);

		doAction(-1, -1, 1);

	}

	public void workOut() {

		this.setHealth(getHealth() + 1);
		this.setHumor(1);
		this.setCleanliness(false);
		doAction(-1, -1, 1);

	}

	public void corona() {

		doAction(-1, -1, +1);
		if (this.isMasque() == true) {
			this.setMasque(false);
			this.setHumor(3);
		} else {
			this.setMasque(true);
			this.setHumor(1);
		}

	}

	public void shower() {
		this.setHumor(2);
		this.setCleanliness(true);
		this.doAction(-1, -1, 1);

	}

	public String moods() {
		String moods = "";
		switch (this.getHumor()) {

		case 1:
			moods = "je suis pas content ><\n*Boude*";
			break;
		case 2:
			moods = "moi quand je suis content je vomis, et la je suis hyper content\n*vomis* ";

			break;
		case 3:
			moods = "haaaaa je me sens mieux";
			break;

		}

		return moods;

	}

	public void doAction(int energyChange, int hungerChange, int wcChange) {
		this.setLifeTime(this.getLifeTime() - 1);
		this.setEnergy(getEnergy() + energyChange);
		this.setHunger(getHunger() + hungerChange);
		this.setWc(this.getWc() + wcChange);
	}

	public String showStats() {
		return (this.getAppearance() + "\n Mon estomac est remplie a " + this.getHunger() + " sur 10"
				+ "\n Ma barre de wc est a " + this.getWc() + "\n Ma barre d'energie est a " + this.getEnergy()
				+ " sur 10" + "\n Ma santé est a " + this.getHealth() + " sur 10"
				+ (this.isMasque() == true ? "\n Je porte un masque" : "Je ne porte pas de masque :)")
				+ (this.isCleanliness() == true ? "\n Je suis propre" : "Je suis sale :)")

		);
	}

	public String getAppearance() {
		return ("Bonjour, je suis " + this.name + "\n je suis de couleur " + this.color + "\n Je mesure " + this.height
				+ " metres");

	}

}
