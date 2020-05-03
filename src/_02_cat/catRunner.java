package _02_cat;

import _01_race_car.RaceCar;

public class catRunner {
	

	public static void main(String[] args) {
Cat CatObject = new Cat("bob");

CatObject.meow();

CatObject.printName();

while(CatObject.isAlive()) {
   CatObject.kill();
}

	}

}
