package tamagochipackage;

public class Dragon extends Animals {

	/**
	 * constructor of dragon change the height for a double between 10 and 20 set
	 * health to 15
	 */
	public Dragon() {
		double heighDragon = (int) (Math.random() * (20 - 10) + 10);
		this.setHeight(heighDragon);
		this.setHealth(15);
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
	 * public function specific to dragon for regen health
	 */
	public void eatFire() {
		this.setHealth(this.getHealth()+1);
	}

}
