package gp.GameObjects;


import gp.logic.Game;
import gp.logic.Position;

public abstract class GameObject {
	protected Position pos;
	protected Game game;
	
	public GameObject(Game game, Position pos) {	
		this.pos = pos;
		this.game = game;
	}
	
	public Position getPosition() {
		return pos;
	}
	
	public boolean isOnPosition(Position pos) {
		return this.pos.getCol() == pos.getCol() && this.pos.getRow() == pos.getRow();
	}
	
	protected abstract String getSymbol();
	public abstract String toString(GameObject c, Position position);
	
}
