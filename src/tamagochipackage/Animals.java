package tamagochipackage;

import java.util.Scanner;

public class Animals {
	public Scanner sc = new Scanner(System.in);
	private String name;
	private int height;
	private String color;
	private int lifeTime;
	private String hairColor;
	private int hunger=10;
	private int wc=0;
	private int energy=10;
	private int humor;// 1=pas content,2= content,3= soulagé
	private int health=10;
	boolean masque=true;
	boolean cleanliness=true;


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
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
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
		if (this.getHunger() < 10) {
			System.out.println("Je suis littéralement mort de faim .");
			this.setHealth(0);
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
		this.setHunger(0);
		this.setWc(this.getWc() + 1);
		this.setHealth(this.getHealth() + 1);
		this.setHumor(2);
		this.setLifeTime(this.getLifeTime() - 1);
		System.out.println("");
		System.out.println("J'ai bien manger");
		System.out.println("");
		action();

	}

	public void goToToilet() {
		this.setHunger(getHunger() + 1);
		this.setWc(0);
		this.setEnergy(getEnergy() - 1);
		this.setHumor(3);
		this.setLifeTime(this.getLifeTime() - 1);
		action();

	}

	public void sleep() {
		this.setEnergy(10);
		this.setHunger(getHunger() + 1);
		this.setWc(getWc() + 1);
		this.setHumor(2);
		this.setLifeTime(this.getLifeTime() - 1);
		action();

	}

	public void dyeHair() {
		System.out.println("quel nouvelle couleurs voulez vous ?");
		String newHairColor;
		do {
			newHairColor = sc.next();
		} while (newHairColor.getClass().equals("String"));
		this.setHunger(getHunger() + 1);
		this.setEnergy(getEnergy() - 1);
		this.setWc(this.getWc() + 1);
		this.setHairColor(newHairColor);
		this.setLifeTime(this.getLifeTime() - 1);
		action();

	}

	public void smoke() {
		this.setEnergy(getEnergy() - 1);
		this.setHunger(getHunger() + 1);
		this.setHealth(getHealth() - 1);
		this.setHunger(getHunger() + 1);
		action();
	}

	public void haveSex() {
		this.setEnergy(getEnergy() - 1);
		this.setHunger(getHunger() + 1);
		this.setWc(this.getWc() + 1);
		this.setHumor(2);
		this.setCleanliness(false);
		this.setLifeTime(this.getLifeTime() - 1);
		action();

	}

	public void hangOut() {
		this.setEnergy(getEnergy() - 1);
		this.setHunger(getHunger() + 1);
		this.setWc(this.getWc() + 1);
		this.setHumor(2);
		this.setLifeTime(this.getLifeTime() - 1);
		action();

	}

	public void workOut() {
		this.setEnergy(getEnergy() - 1);
		this.setHunger(getHunger() + 1);
		this.setWc(this.getWc() + 1);
		this.setHealth(getHealth() + 1);
		this.setHumor(1);
		this.setCleanliness(false);
		this.setLifeTime(this.getLifeTime() - 1);
		action();

	}

	public void corona() {
		this.setEnergy(getEnergy() - 1);
		this.setHunger(getHunger() + 1);
		this.setWc(this.getWc() + 1);
		if (this.isMasque() == true) {
			this.setMasque(false);
			this.setHumor(3);
		} else {
			this.setMasque(true);
			this.setHumor(1);
		}
		action();
	}

	public void shower() {
		this.setEnergy(getEnergy() - 1);
		this.setHunger(getHunger() + 1);
		this.setLifeTime(this.getLifeTime() - 1);
		this.setWc(this.getWc() + 1);
		this.setHumor(2);
		this.setCleanliness(true);
		action();

	}

	public void moods() {
		switch (this.getHumor()) {
		case 1:
			System.out.println("je suis pas content ><");
			System.out.println("*Boude*");
			break;
		case 2:
			System.out.println("moi quand je suis content je vomis, et la je suis hyper content");
			System.out.println("*vomis*");
			break;
		case 3:
			System.out.println("haaaaa je me sens mieux");
			break;

		}
		action();

	}

	public void showApparance() {
		System.out.println("");
		System.out.println("Bonjour, je suis " + this.name);
		System.out.println("je suis de couleur " + this.color);
		System.out.println("Je mesure " + this.height + " metres");
	}

	public void action() {
		if (this.getHealth() < 1 || this.getLifeTime() < 1) {
			System.out.println("Adieu ...");
			System.out.println("FATALITY");
			System.out.println("Votre " + this.getName() + " est mort.");
		} else {
			if (this.getEnergy() < 1) {
				System.out.println("je suis trop fatigué, je vais dormir ");
				System.out.println("Bonne nuit !");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				sleep();
			} else {
				if (this.getWc() > 9) {
					System.out.println("Désolé je n'ai pas pu me retenir =S");
					this.setCleanliness(false);
					this.setWc(0);
					action();
				} else {
					if (this.getHunger() < 1) {
						System.out.println("Jai trop faim, je vais manger !");
						eat();
					} else {
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("quel action vouler vous faire ?");
						System.out.println("1 pour aller chez le coiffeur");
						System.out.println("2 pour manger");
						System.out.println("3 pour aller au toilette");
						System.out.println("4 pour dormir");
						System.out.println("5 pour ce reproduire");
						System.out.println("6 pour exprimer mon humeur");
						System.out.println("7 aller voir des amis");
						System.out.println("8 faire du sport");
						System.out.println("9 interagir avec mon masque");
						System.out.println("10 ce laver");
						System.out.println("11 aller fumer");

						System.out.println("quel action vouler vous faire ?");
						int action = sc.nextInt();
						switch (action) {
						case 1:
							dyeHair();
							break;
						case 2:
							eat();
							break;
						case 3:
							goToToilet();
							break;
						case 4:
							sleep();
							break;
						case 5:
							haveSex();
							break;
						case 6:
							moods();
							break;
						case 7:
							hangOut();
							break;
						case 8:
							workOut();
							break;
						case 9:
							corona();
							break;
						case 10:
							shower();
							break;
						case 11:
							smoke();
							break;
						default:
							action();

						}
					}
				}
			}
		}
	}

}
