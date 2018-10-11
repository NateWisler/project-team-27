package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
	@JsonProperty private AtackStatus result;
	@JsonProperty private Ship ship;
	@JsonProperty private Square location;

	public AtackStatus getResult() { return result; }

	public void setResult(AtackStatus result) { this.result = result; }

	public Ship getShip() { return ship; }

	public void setShip(Ship ship) { this.ship = ship; }

	public Square getLocation() { return location; }

	public void setLocation(Square square) { location = square; }
}
