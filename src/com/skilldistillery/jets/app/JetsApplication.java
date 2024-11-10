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
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;
				case 8:
					
					break;
				case 9:
					System.out.println("Thank you for coming!!!");
					keepGoing = false;
					break;

					default:
						System.out.println("Please choose a valid input!!");
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
