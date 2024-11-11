package com.skilldistillery.jets.entities;

public class FighterJet extends Jet {

	public FighterJet() {
		super();
	}

	public FighterJet(String model, int speed, int range, double price, String jetType) {
		super(model, speed, range, price, jetType);
		// TODO Auto-generated constructor stub
	}
	public Jet fight() {
		System.out.println(getModel() + " has joined the fight");
		plane();
		return null;
	}
	
	private void plane() {
		System.out.println("	     ,-.\n" 
	                     + "   _,.      /  /\n" 
				         + "  ; \\____,-==-._  \n" 
	                     + "  //_    `----' {+>\n"
	                     + "  `  `'--/  /-'`\n" 
	                     + "        /  / \\\n" 
	                     + "        `='   \\\n"
						 + "               *pew pew*");
	}
}
