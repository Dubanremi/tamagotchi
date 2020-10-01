package tamagochipackage;

public class Phenix extends Animals{
	public Phenix() {
		int heighPhenix = 1 + (int) (Math.random() * (3));
		this.setHeight(heighPhenix);
		this.setHealth(8);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs est ma criniere ?");
		this.setHairColor(sc.next());
	}
	public void showApparance() {
		super.showApparance();
		System.out.println("ma criniere est " + this.getHairColor());
	}
}
