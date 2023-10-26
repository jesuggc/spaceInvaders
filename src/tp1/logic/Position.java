package tp1.logic;

/**
 * 
 * Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private int row;
	private int col;

	//TODO fill your code
	public Position(int row, int col) {
		this.row = row;
		this.col = col;
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
