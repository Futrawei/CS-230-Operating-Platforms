package com.gamingroom;

import java.util.Objects;

/**
 * A class to test a singleton's behavior
 * 
 * @author Travis Barbur
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");

		/*Explanation of the Singleton Pattern:
		The singleton instance of the Game Service (global access point).
		This will check if there is a singular memory, and if not
		 create a new instance. This will allow flexibility to
		 create more objects. This will restrict the instantiation of a class
		 and ensure one instance of this class. */
		GameService service = GameService.getInstance(); // replaced null with GameService.getInstance
		
		// a simple for loop to print the games
		for (int i = 1; i <= service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
