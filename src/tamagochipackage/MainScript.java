package tamagochipackage;

import java.util.Scanner;

public class MainScript {
	/**
	 * 
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quel type de tamagotchi voulez vous ? ");
		System.out.println("1 dragon ");
		System.out.println("2 licorne");
		System.out.println("3 trolls ");
		System.out.println("4 phenix ");
		switch (sc.nextInt()) {
		case 1:
			Dragon myDragon = new Dragon();
			myDragon.askInfo();
			System.out.println(myDragon.getAppearance());
			createMenu(myDragon);
			break;

		case 2:
			Licorne myLicorne = new Licorne();
			myLicorne.askInfo();
			System.out.println(myLicorne.getAppearance());
			createMenu(myLicorne);
			break;
		case 3:
			Trolls myTrolls = new Trolls();
			myTrolls.askInfo();
			System.out.println(myTrolls.getAppearance());
			createMenu(myTrolls);
			break;
		case 4:
			Phenix myPhenix = new Phenix();
			myPhenix.askInfo();
			System.out.println(myPhenix.getAppearance());
			createMenu(myPhenix);
			break;
		}
	}

	public static <T extends Animals> void createMenu(T tamagotchi) {

		do {
			if (tamagotchi.getEnergy() < 1) {

				System.out.println("je suis trop fatigué, je vais dormir ");
				System.out.println("Bonne nuit !");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				tamagotchi.sleep();
			} else {
				if (tamagotchi.getWc() > 9) {
					System.out.println("Désolé je n'ai pas pu me retenir =S");
					tamagotchi.setCleanliness(false);
					tamagotchi.goToToilet();

				} else {
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("quel action vouler vous faire ?");
					System.out.println("1 pour aller chez le coiffeur");
					System.out.println("2 pour manger");
					System.out.println("3 pour aller au toilette");
					System.out.println("4 pour dormir");
					System.out.println("5 pour ce reproduire");
					System.out.println("6 pour exprimer mon humeur");
					System.out.println("7 aller voir des amis");
					System.out.println("8 faire du sport");
					System.out.println("9 interagir avec mon masque");
					System.out.println("10 ce laver");
					System.out.println("11 aller fumer");
					System.out.println("12 afficher stats");
					System.out.println("quel action vouler vous faire ?");
					Scanner sc = new Scanner(System.in);
					int action = sc.nextInt();
					executeAction(action, tamagotchi);
				}
			}

		} while (tamagotchi.getHealth() > 0);

		System.out.println("Adieu ...");
		System.out.println("FATALITY");
		System.out.println("Votre " + tamagotchi.getName() + " est mort.");
	}

	public static <T extends Animals> void executeAction(int userChoice, T t) {

		switch (userChoice) {
		case 1:
			t.dyeHair();
			break;
		case 2:
			t.eat();
			System.out.println("");
			System.out.println("J'ai bien manger");
			System.out.println("");
			break;
		case 3:
			t.goToToilet();
			System.out.println("");
			System.out.println("J'ai bien etait au toilettes");
			System.out.println("");
			
			break;
		case 4:
			t.sleep();
			System.out.println("");
			System.out.println("J'ai bien Dormi");
			System.out.println("");
			break;
		case 5:
			t.haveSex();
			System.out.println("");
			System.out.println("J'ai bien haveSex");
			System.out.println("");
			break;
		case 6:
			System.out.println(t.moods());
			break;
		case 7:
			t.hangOut();
			System.out.println("");
			System.out.println("j'ai apprecier ma sortie avec mes amis");
			System.out.println("");
			break;
		case 8:
			t.workOut();
			System.out.println("");
			System.out.println("La séance de sport etait crevante");
			System.out.println("");
			break;
		case 9:
			t.corona();
			System.out.println("");
			System.out.println("J'ai interagi avec mon masque");
			System.out.println("");
			break;
		case 10:
			t.shower();
			System.out.println("");
			System.out.println("J'ai pris une douche, je me sens propre");
			System.out.println("");
			break;
		case 11:
			t.smoke();
			System.out.println("");
			System.out.println("J'ai fumer");
			System.out.println("");
			break;
		case 12:
			System.out.println(t.showStats());
			break;
		default:

		}
	}
}
