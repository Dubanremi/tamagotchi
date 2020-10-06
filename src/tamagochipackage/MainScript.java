package tamagochipackage;

import java.util.Scanner;

public class MainScript {

	/**
	 * function main who ask which type of animals i want and create a object of my
	 * choice (all my object inherit of my class Animals)
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
			createMenu(myDragon);
			break;

		case 2:
			Licorne myLicorne = new Licorne();
			createMenu(myLicorne);
			break;
		case 3:
			Trolls myTrolls = new Trolls();
			createMenu(myTrolls);
			break;
		case 4:
			Phoenix myPhenix = new Phoenix();
			createMenu(myPhenix);
			break;
		}
	}

	/**
	 * My function createMenu, verify all the stats of my animals like energy or wc
	 * and after , create menu for the user, he can choose which action .
	 * 
	 * @param <T>        is a generic class for call my method on my object, even if
	 *                   my object is not created (extends animals, so i have access
	 *                   at all my method in animals, but when object is created, is
	 *                   the method of my children class who take priorities)
	 * @param tamagotchi is my object created
	 */
	public static <T extends Animals> void createMenu(T tamagotchi) {

		tamagotchi.askInfo();// ask at the user the stats of his choice
		System.out.println(tamagotchi.getAppearance());// print all the stats of my animals

		do {
			if (tamagotchi.getEnergy() < 1) {// if my animals dont have energy, he's gonna sleep, and use one lifetime
												// etc

				System.out.println("je suis trop fatigu�, je vais dormir ");
				System.out.println("Bonne nuit !");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				tamagotchi.sleep();
			} else {
				if (tamagotchi.getWc() > 9) {// if my animals have too much wc, he's gonna go to toilet, and use one
												// lifetime etc
					System.out.println("D�sol� je n'ai pas pu me retenir =S");
					tamagotchi.setCleanliness(false);
					tamagotchi.goToToilet();

				} else {// if there is no stats in red alert, create the menu for my user
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("quel action vouler vous faire ?");
					System.out.println("1 pour aller chez le coiffeur");
					System.out.println("2 pour manger");
					System.out.println("3 pour aller au toilette");
					System.out.println("4 pour dormir");
					System.out.println("5 pour se reproduire");
					System.out.println("6 pour exprimer mon humeur");
					System.out.println("7 pour aller voir des amis");
					System.out.println("8 pour faire du sport");
					System.out.println("9 pour interagir avec mon masque");
					System.out.println("10 pour se laver");
					System.out.println("11 pour aller fumer");
					System.out.println("12 pour afficher stats");
					if (tamagotchi instanceof Dragon) { // test of function specific at a children class, add a choice
														// for the user in function of the type of my opbject
						System.out.println("13 ce regenerer avec du feu");

					} else if (tamagotchi instanceof Trolls) {
						System.out.println("13 aller taper des chose pour regen l'energy");
					}
					System.out.println("quel action voulez vous faire ?");
					Scanner sc = new Scanner(System.in);
					int action = sc.nextInt();
					executeAction(action, tamagotchi);// send the user choice at my method
				}
			}

			if (tamagotchi instanceof Phoenix) {// check if my animals is a phoenix
				Phoenix phoenix = (Phoenix) tamagotchi;// cast my class phoenix on the object p for use my method
														// specific at my class phoenix

				if (phoenix.getHealth() < 1 && phoenix.canResurect()) {

					System.out.println("Votre " + phoenix.getName() + " est mort.");
					System.out.println("Mais ... que ce passe t-il ?");
					System.out.println("Votre phoenix renait de ces cendres avec 5 pv ");
					phoenix.setResurect(false);
					phoenix.resurect();

				}
			}

		} while (tamagotchi.getHealth() > 0);
		// when my animals die, script stop
		System.out.println("Adieu ...");
		System.out.println("FATALITY");
		System.out.println("Votre " + tamagotchi.getName() + " est mort.");

	}

	/**
	 * in function of the user choice, do some method
	 * 
	 * @param <T>        generic class for call my method
	 * @param userChoice
	 * @param t          : my object
	 */
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
			System.out.println("La s�ance de sport etait crevante");
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
		case 13:
			if (t instanceof Dragon) {// test of method specific to an object, switch of method in fucntion of type of
										// my object
				Dragon myDragon = (Dragon) t;
				myDragon.eatFire();
				System.out.println("miam le feu c'est bon.");
			} else if (t instanceof Trolls) {
				Trolls myTrolls = (Trolls) t;
				myTrolls.fightThings();
				System.out.println("Gneuh taper !");
			}
			break;

		default:

		}
	}
}
