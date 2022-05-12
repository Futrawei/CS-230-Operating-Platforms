package com.gamingroom;

import java.util.Objects;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// FIXME: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); // replace null with GameService.getInstance
		
		// a simple for loop to print the games
		for (int i = 0; i < Objects.requireNonNull(service).getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
