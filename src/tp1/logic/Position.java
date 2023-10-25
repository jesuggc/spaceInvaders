package tp1.logic;

/**
 * 
 * Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private int col;
	private int row;

	//TODO fill your code
	public Position(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	public int getCol() {
		return this.col;
	}
	public int getRow() {
		return this.row;
	}

	public boolean equals(Position pos) {
		if(pos.col == this.col && pos.row == this.row) return true;
		return false;
	}

}
