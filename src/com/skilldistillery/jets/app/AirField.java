package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class AirField {
	private List<Jet> jets = new ArrayList<>();
	// no other fields

	public AirField() {
		loadJetsFromFile("Jets.txt");
	}

	private void loadJetsFromFile(String fileName) {
		// FIXME - buffer reader template goes here
		
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] jetData = line.split(",");
				
				String jetType = jetData[0];
				String jetModel = jetData[1];
				int jetSpeed = Integer.parseInt(jetData[2]);
				int jetRange = Integer.parseInt(jetData[3]);
				double jetPrice = Double.parseDouble(jetData[4]);

//				Jet p = new Jet(jetModel, jetSpeed, jetRange, jetPrice);
				if (jetType.equalsIgnoreCase("Cargo")) {
					Jet cargo = new CargoJet(jetModel, jetSpeed, jetRange, jetPrice, jetType);
					jets.add(cargo);
					
				} else if (jetType.equalsIgnoreCase("Fighter")) {
					
					Jet fighter = new FighterJet(jetModel, jetSpeed, jetRange, jetPrice, jetType);
					jets.add(fighter);
					
				}else if (jetType.equalsIgnoreCase("Passenger")) {
					Jet passenger = new PassengerJet(jetModel, jetSpeed, jetRange, jetPrice, jetType);
					jets.add(passenger);
			}
				
			}	
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	public void listJets() {
		for (int i = 0; i < jets.size(); i++) {
			seperatorT();
			System.out.println("|   "+jets.get(i)+ "   |");
			seperatorB();
		}
	}
		
		public void jetsFlying() {
			for (int i = 0; i < jets.size(); i++) {
				seperatorT();
				int speed =  jets.get(i).getSpeed();
				int range = jets.get(i).getRange();
				int time = range/speed;
				System.out.println("   \n~~~~NNYYYOOOOOOMMMMMM~~~\n");
				plane();
				System.out.println(jets.get(i).getModel()+" is flying! At " + speed + "MPH"+ " for the distance of "+ range +"miles, in "+time +" hours.\n"+"This plane costs $" + jets.get(i).getPrice());
				seperatorB();
				
			}
		}
	private void seperatorT() {
		System.out.println("======================================================================");
	}
	private void seperatorB() {
		System.out.println("======================================================================\n\n");
	}
	private void plane() {
		System.out.println("	     ,-.\n"
				         + "   _,.      /  /\n"
				         + "  ; \\____,-==-._  \n"
				         + "  //_    `----' {+>\n"
				         + "  `  `'--/  /-'`\n"
				         + "        /  /\n"
				         + "        `='");
	}
	}
