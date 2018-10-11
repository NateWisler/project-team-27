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
		// TODO Implement
		return false;
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Result attack(int x, char y) {
		//TODO Implement
		return null;
	}

	public List<Ship> getShips() { return boardShips; }

	public void setShips(List<Ship> ships) { boardShips.addAll(ships); }

	public List<Result> getAttacks() { return boardAttacks; }

	public void setAttacks(List<Result> attacks) { boardAttacks.addAll(attacks); }
}
