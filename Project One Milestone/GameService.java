package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 *
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static final List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/*Local instance. final single object instance which is the singleton pattern.*/
	private static final GameService instance = new GameService();

	/*Accessor for the instance. Allowing classes outside to
	access this object in the singleton class.*/
	public static GameService getInstance() {
		return instance;
	}

	/**
	 * Construct a new game instance
	 *
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// if found, simply return the existing instance
		for (Game currentGame : games) {
			if (currentGame.getName().equals(name)) {
				return currentGame;
			}
		}

		// if not found, make a new game instance and add to list of games
		game = new Game(nextGameId++, name);
		games.add(game);
		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 *
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// if found, simply assign that instance to the local variable
		// for loop list of games. If statement if one already exists
		// return game instance
		for (Game currentGame : games) {
			if (currentGame.getId() == id){
				game = currentGame;
			}
		}
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 *
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Instance iterator
		Iterator<Game> gamesIterator = games.iterator();

		// Iterate over games list
		while (gamesIterator.hasNext()) {

			// Set local Game var to next item in list
			Game gameInstance = gamesIterator.next();

			// Does game name already exist?
			if (gameInstance.getName().equalsIgnoreCase(name)) {
				// If game name already exists, return the game instance
				game = gameInstance;
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 *
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
