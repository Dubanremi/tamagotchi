package tamagochipackage;

public class Dragon extends Animals{
	public Dragon() {
		int heighDragon = 10 + (int) (Math.random() * (20));
		this.setHeight(heighDragon);
		this.setHealth(15);
	}
	public void askInfo() {
		super.askInfo();
		System.out.println("De quel couleurs sont mes écailles ?");
		this.setHairColor(sc.next());
	}
	public void showApparance() {
		super.showApparance();
		System.out.println("mes écailles sont " + this.getHairColor());
	}

}
