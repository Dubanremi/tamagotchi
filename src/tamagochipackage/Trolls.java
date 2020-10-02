package tamagochipackage;

public class Trolls extends Animals{
	public Trolls() {
		int heighTrolls = (int) (Math.random() * (100)+10);
		double heighTrollsDouble= heighTrolls/10;
		this.setHeight(heighTrollsDouble);
		this.setHealth(12);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs sont mes cheveux ?");
		this.setHairColor(sc.next());
	}
	public String getAppearance() {
		String appearance ="\n je suis un trolls \n mes cheveux " + this.getHairColor();
		return(super.getAppearance()+appearance);

	}
}
