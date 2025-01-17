package gp.logic;


public class Position {

	private int col;
	private int row;
	
	public Position(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
	public boolean equals(Position pos) {
		return (this.col == pos.col) && (this.row == pos.row);
	}
	

public boolean isOnBoard() {
	return (col >= 0) && (col < Game.DIM_X) && (row >= 0) && (row < Game.DIM_Y);
}

}
