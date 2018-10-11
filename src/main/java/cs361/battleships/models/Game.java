package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import static cs361.battleships.models.AtackStatus.*;

public class Game {

    @JsonProperty private Board playersBoard = new Board();
    @JsonProperty private Board opponentsBoard = new Board();

    /*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
    public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {
        boolean successful = playersBoard.placeShip(ship, x, y, isVertical);
        if (!successful)
            return false;

        boolean opponentPlacedSuccessfully;
        do {
            // AI places random ships, so it might try and place overlapping ships
            // let it try until it gets it right
            opponentPlacedSuccessfully = opponentsBoard.placeShip(ship, randRow(), randCol(), randVertical());
        } while (!opponentPlacedSuccessfully);

        return true;
    }

    /*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
    public boolean attack(int x, char  y) {
        Result playerAttack = opponentsBoard.attack(x, y);
        if (playerAttack.getResult() == INVALID) {
            return false;
        }

        Result opponentAttackResult;
        do {
            // AI does random attacks, so it might attack the same spot twice
            // let it try until it gets it right
            opponentAttackResult = playersBoard.attack(randRow(), randCol());
        } while(opponentAttackResult.getResult() != INVALID);

        return true;
    }

    private char randCol() {
        // TODO implement

	    Random rand = new Random();                                    // Creates random number generator
        int randColValue = rand.nextInt(9);                      // This holds a random number between 0 and 9 (represents spots 1 through 10 on the board)
	    System.out.println(randColValue);

        return (char) randColValue;
    }

    private int randRow() {
        // TODO implement

	    Random rand = new Random();                                     // Creates random number generator
	    return rand.nextInt(10);
    }

    private boolean randVertical() {
        return new Random().nextBoolean();                              // Source: https://docs.oracle.com/javase/7/docs/api/java/util/Random.html#nextBoolean%28%29
    }
}
