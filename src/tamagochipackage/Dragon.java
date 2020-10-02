package tamagochipackage;

public class Dragon extends Animals{
	public Dragon() {
		double heighDragon =  (int)(Math.random() * (20-10)+10);
		this.setHeight(heighDragon);
		this.setHealth(15);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs sont mes écailles ?");
		this.setHairColor(sc.next());
	}
	public String getAppearance() {
		String appearance ="\n je suis un dragon \n mes écailles sont " + this.getHairColor();

		return(super.getAppearance()+appearance);

	}

}
