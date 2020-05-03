package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	    RaceCar RaceCarObject = new RaceCar("BMW",5);
	
	
		// 2. Print the RaceCar's position in the race
System.out.println("your position is " + RaceCarObject.getPositionInRace() + "th place");
		// 3. Crash the RaceCar
		RaceCarObject.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(RaceCarObject.isDamaged()) {
RaceCarObject.pit();
}
		// 5. Help the car move into first place.
while(RaceCarObject.getPositionInRace()!=1) {
	RaceCarObject.overtake();
}

System.out.println("your BMW won the race!!");
	
	}
}
