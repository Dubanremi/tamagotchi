package tamagochipackage;

public class Trolls extends Animals{
	public Trolls() {
		int heighTrolls = 3 + (int) (Math.random() * (11));
		this.setHeight(heighTrolls);
		this.setHealth(8);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs sont mes cheveux ?");
		this.setHairColor(sc.next());
	}
	public void showApparance() {
		super.showApparance();
		System.out.println("mes cheveux " + this.getHairColor());
	}
}
