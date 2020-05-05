package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {

		Microwave MicrowaveObject = new Microwave();

		String flavor= JOptionPane.showInputDialog("what flavor would you like your popcorn to be?");
		
		Popcorn PopcornObject=new Popcorn(flavor);
		
		String cookTimeInMinutes= JOptionPane.showInputDialog("How long do you want your popcorn in the microwave?");
		
		int time = Integer.parseInt(cookTimeInMinutes);
		
		MicrowaveObject.setTime(time);
		
		MicrowaveObject.putInMicrowave(PopcornObject);
		
		MicrowaveObject.startMicrowave();
		
		PopcornObject.eat();
		
		PopcornObject.applyHeat();
		
		
	}

}
