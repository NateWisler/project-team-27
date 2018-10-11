package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;

	public Ship() {
		occupiedSquares = new ArrayList<>();
	}

	public Ship(String kind) {
		if(kind.equals("MINESWEEPER"))
			occupiedSquares = new ArrayList<>(2);
		else if(kind.equals("DESTROYER"))
			occupiedSquares = new ArrayList<>(3);
		else if(kind.equals("BATTLESHIP"))
			occupiedSquares = new ArrayList<>(4);
	}

	public List<Square> getOccupiedSquares() {
		return occupiedSquares;
	}
}
