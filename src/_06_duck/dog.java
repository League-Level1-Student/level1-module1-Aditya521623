package _06_duck;

import javax.swing.JOptionPane;

public class dog {

	private int numOfFriends;
	private String favFood;

	dog(int numOfFriends, String favFood) {
		this.numOfFriends = numOfFriends;
		this.favFood = favFood;
	}

	public void hi() {
		JOptionPane.showMessageDialog(null, "I am a dog. I have " + numOfFriends + " friend. Hello friends");

	}

	public void food() {
		JOptionPane.showMessageDialog(null, " I am a dog. MY favorite food is " + favFood);
	}
}
