package tamagochipackage;

public class Licorne extends Animals{
	public Licorne() {
		int heighLicorne =  ((int) (Math.random() * (40)+10)) ;
		double heightLicorneDouble = heighLicorne/10;
		this.setHeight(heightLicorneDouble);
		this.setHealth(8);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs est ma criniere ?");
		this.setHairColor(sc.next());
	}
	public String getAppearance() {
		String appearance = "\n je suis une licorne \n ma criniere est " + this.getHairColor();
		return(super.getAppearance()+appearance);

	}

}
