

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar vroomvroom = new RaceCar("rust-eze",5);
		// 2. Print the RaceCar's position in the race
System.out.println("you are in 5th place");
		// 3. Crash the RaceCar
vroomvroom.crash();	
vroomvroom.isDamaged();
		// 4. If the car is damaged. Bring it in for a pit stop.
vroomvroom.pit();
		// 5. Help the car move into first place.
for (int i=0; i<7; i++) {
vroomvroom.overtake();
}
	}
}
