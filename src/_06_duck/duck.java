package _06_duck;

import javax.swing.JOptionPane;

public class duck {

	private int numberOfFriends;
	private String favoriteFood;

	duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	public void food() {
		JOptionPane.showMessageDialog(null, "Im a duck. MY favorite food is " + favoriteFood);
	}

	public void hi() {
		JOptionPane.showMessageDialog(null, "Im a duck. I have " + numberOfFriends + " friend. Hello friend.");
	}
}
