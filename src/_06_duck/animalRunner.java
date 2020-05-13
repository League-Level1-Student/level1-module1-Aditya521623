package _06_duck;

public class animalRunner {

	public static void main(String[] args) {
		duck daffy = new duck("ice cream", 1);
		dog george = new dog(2, "dog food");

		daffy.food();

		daffy.hi();

		george.food();

		george.hi();

	}

}
