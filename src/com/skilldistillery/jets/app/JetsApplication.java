package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {
	private AirField airField = new AirField();
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		JetsApplication JP = new JetsApplication();
		JP.launch();

		sc.close();
	}

	private void launch() {
		boolean keepGoing = true;

		while (keepGoing) {
			displayUserMenu();
			seperator();
			System.out.println("Please choose an option from above: ");
			String input = sc.nextLine();
			try {
				int i = Integer.valueOf(input);
				switch (i) {
				case 1:
					System.out.println("You have chosen to list out the jets, here they are!");
					airField.listJets();
					break;
				case 2:
					System.out.println("You have chosen for the planes to fly, here they go!");
					airField.jetsFlying();
					
					break;
				case 3:
					System.out.println("Lets see which plane is the fastest!!!");
					airField.fastestJet();
					break;
				case 4:
					System.out.println("Lets see which plane travels the furthest!!!");
					airField.longestRange();
					break;
				case 5:
					airField.loadCargo();
					break;
				case 6:
					airField.dogFight();
					
					break;
				case 7:
					System.out.println("Please choose a jet to add! select 1 for Cargo Jet, 2 for Fighter Jet, and 3 for Passenger Jet: ");
					String jT = sc.nextLine();
					System.out.println("What model is your plane?");
					String mod = sc.nextLine();
					System.out.println("How fast does this go?");
					int speed = (int)sc.nextInt();
					sc.nextLine();
					System.out.println("What range does this have?");
					int range = (int)sc.nextInt();
					sc.nextLine();
					System.out.println("And how much does it cost?");
					double cost = (double)sc.nextDouble();
					sc.nextLine();
					
					airField.addNewJet(mod, speed, range, cost, jT);
					
					break;
				case 8:
						airField.listJets();
						System.out.println("\nWhich airplane would you like to remove from the hanger?");
						try {
						int deletion = sc.nextInt();
						sc.nextLine();
						airField.removeJet(deletion);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.err.println(e);
						System.err.println("Please choose a number correlating to the plane you want to remove");
					}
					break;
				case 9:
					System.out.println("Thank you for coming!!!");
					keepGoing = false;
					break;

					default:
						System.err.println("Please choose a valid input!!");
						return;
					
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		
		}
	}
	

	private void displayUserMenu() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("********************************************************");
		System.out.println("********* Welcome In, What Would you like to Do? *******");
		System.out.println("********************************************************");
		System.out.println("* 1.) List fleet         *******************************");
		System.out.println("* 2.) Fly all jets         *****************************");
		System.out.println("* 3.) View Fastest Jet         *************************");
		System.out.println("* 4.) View jet with longest range         **************");
		System.out.println("* 5.) Load all Cargo Jets         **********************");
		System.out.println("* 6.) Dogfight!         ********************************");
		System.out.println("* 7.) Add a jet to Fleet         ***********************");
		System.out.println("* 8.) Remove a jet from Fleet         ******************");
		System.out.println("* 9.) Quit         *************************************");
		System.out.println("********************************************************");
	}
	private void seperator() {
		System.out.println("\n========================================================\n");
	}
}
