package tamagochipackage;

public class Licorne extends Animals{
	public Licorne() {
		int heighLicorne = 1 + (int) (Math.random() * (4));
		this.setHeight(heighLicorne);
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
