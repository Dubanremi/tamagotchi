package tamagochipackage;

public class Phenix extends Animals{



	public Phenix() {
		int heighPhenix = (int) (Math.random() * (20)+1);
		double heightDoublePhenix = (double) heighPhenix / 10;
		this.setHeight(heightDoublePhenix);
		this.setHealth(8);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs est ma criniere ?");
		this.setHairColor(sc.next());
	}
	public String getAppearance() {
		
		String appearance="\n je suis un phenix \n ma criniere est " + this.getHairColor();
		return(super.getAppearance()+appearance);
	}
	
	public void resurect()
	{
	
	}
}
