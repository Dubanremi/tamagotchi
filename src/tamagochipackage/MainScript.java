package tamagochipackage;

import java.util.Scanner;

public class MainScript {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quel type de tamagotchi voulez vous ? ");
		System.out.println("1 dragon ");
		System.out.println("2 licorne");
		System.out.println("3 trolls ");
		System.out.println("4 phenix ");
		switch (sc.nextInt()){
		case 1 :
			Dragon myDragon = new Dragon();
			myDragon.askInfo();			
			myDragon.showApparance();
			myDragon.action();
			break;
			
		case 2 :
			Licorne myLicorne = new Licorne();
			myLicorne.askInfo();
			myLicorne.showApparance();
			myLicorne.action();
			break;
		case 3 :
			Trolls myTrolls = new Trolls();
			myTrolls.askInfo();
			myTrolls.showApparance();
			myTrolls.action();
			break;
		case 4 :
			Phenix myPhenix = new Phenix();
			myPhenix.askInfo();
			myPhenix.showApparance();
			myPhenix.action();
			break;
	}


	}
}
