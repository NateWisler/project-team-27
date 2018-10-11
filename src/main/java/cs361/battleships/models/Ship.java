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

	public String getShipType() { return shipType; }

	public void setShipType(String kind) { shipType = kind; }

	public int getLength() { return length; }

	public void setLength(int length) { this.length = length; }
}
