package tp1.logic;

import java.util.Random;
import tp1.logic.gameobjects.UCMShip;;

// TODO implementarlo
public class Game {

	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;
	public static final int INITIAL_COL = 4;
	public static final int INITIAL_ROW = 7;
	private UCMShip ucmShip;
	private Position initialShipPosition = new Position(INITIAL_COL, INITIAL_ROW);
	private int cycle = 0;

	// TODO fill your code
	public Game(Level level, long seed) {
		// TODO fill your code
		ucmShip = new UCMShip(this,initialShipPosition);

	}

	public void update() {
		cycle++;
		// moveLaser();
	}

	public boolean moveShip(Move toDirection) {
		return ucmShip.move(toDirection);
	}

	public String stateToString() {
		// TODO fill your code
		return null;
	}

	public boolean shootLaser() {
		return (this.ucmShip.shootLaser());
	}

	public int getCycle() {
		return cycle;
	}

	public int getRemainingAliens() {
		// TODO fill your code
		return 0;
	}

	public String positionToString(int col, int row) {
		if (ucmShip.getPosition().equals(new Position(col, row)))
			return ucmShip.toString();

		return "";
	}

	public boolean playerWin() {
		// TODO fill your code
		return false;
	}

	public boolean aliensWin() {
		// TODO fill your code
		return false;
	}

	public void enableLaser() {
		// TODO fill your code
	}

	public Random getRandom() {
		// TODO fill your code
		return null;
	}

	public Level getLevel() {
		// TODO fill your code
		return null;
	}

}
