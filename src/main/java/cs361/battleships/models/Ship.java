package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;
	@JsonProperty private String shipType;
	@JsonProperty private int length;

	public Ship() {
		occupiedSquares = new ArrayList<>();
		shipType = "";
		length = 0;
	}

	public Ship(String kind) {
		occupiedSquares = new ArrayList<>();
		shipType = kind;
		if(shipType.equals("MINESWEEPER"))
			length = 2;
		else if(shipType.equals("DESTROYER"))
			length = 3;
		else if(shipType.equals("BATTLESHIP"))
			length = 4;
	}

	public List<Square> getOccupiedSquares() { return occupiedSquares; }

	public void setOccupiedSquares(List<Square> location) { occupiedSquares.addAll(location); }
}
