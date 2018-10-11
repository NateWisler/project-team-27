package cs361.battleships.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Result> boardAttacks;
	private List<Ship> boardShips;

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Board() {
		boardAttacks = new ArrayList<>();
		boardShips = new ArrayList<>();
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {

		// TODO Check if ship type was already placed

		for (String boardShipType : boardShips) {
			System.out.println("== Ship Type: " + shipType);

			if (ship.shipType.equals(boardShipType)){ 							// Checks if ship is already on board (checks boardShips)

				return false;													// Send help. I have no clue if this is correct

			}
		}

		// TODO Check if placement of ship is valid (Out of bounds)
		if (x < 0 || x > 9 || y < 'A' || y > 'J') {

			return false;

		}

		// TODO Get the size of ship

		// TODO Check if ship is vertical

		// TODO Check if spot is already taken

		// TODO Place ship

		boardShips.add(ship) 				// Add ship to vector
		


		return false;
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Result attack(int x, char y) {
		//TODO Implement
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
