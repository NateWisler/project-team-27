package cs361.battleships.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Result> boardAttacks;
	private List<Ship> boardShips;

	/*
	 * DO NOT change the signature of this method. It is used by the grading
	 * scripts.
	 */
	public Board() {
		boardAttacks = new ArrayList<>();
		boardShips = new ArrayList<>();
	}

	/*
	 * DO NOT change the signature of this method. It is used by the grading
	 * scripts.
	 */
	public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {

		// TODO Check if ship type was already placed
		// for (String boardShipType : boardShips) { // Send help. I have no clue if
		// this syntax is correct

		for (int i = 0; i < boardShips.size(); i++) {

			String boardShipType = boardShips.get(i).getShipType();

			System.out.println("== Ship Type: " + boardShipType);

			if (ship.getShipType().equals(boardShipType)) { // Checks if ship is already on board (checks boardShips)

				return false;

			}
		}

		// TODO Check if placement of ship is valid (Out of bounds)
		if (x < 0 || x > 9 || y < 'A' || y > 'J') { // Check if ships are in bounds. X axis are numbers. Y axis are
													// chars.

			return false;

		}

		int shipSize = ship.getLength(); // Gets the size of the ship

		// TODO Check if ship is vertical and adjust coordinates accordingly

		if (isVertical == true) {

			// Perform checks here
			// transform spots taken from horizontal to vertical (swap coordinates)

		}

		// TODO Check if spot is already taken

		// TODO Place ship

		boardShips.add(ship); // Add ship to vector
								// Double check the above line

		return true; // Take a look at this later...
	}

	/*
	 * DO NOT change the signature of this method. It is used by the grading
	 * scripts.
	 */
	public Result attack(int x, char y) {
		// TODO Implement
		return null;
	}

	public List<Ship> getShips() {
		return boardShips;
	}

	public void setShips(List<Ship> ships) {
		boardShips.addAll(ships);
	}

	public List<Result> getAttacks() {
		return boardAttacks;
	}

	public void setAttacks(List<Result> attacks) {
		boardAttacks.addAll(attacks);
	}
}
