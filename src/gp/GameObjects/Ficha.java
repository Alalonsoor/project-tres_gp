package gp.GameObjects;

import gp.logic.Position;
import gp.view.Messages;

public class Ficha {
	
	
	public String toString(GameObject c, Position p, int turno) {
		if (turno == 1) 
			return Messages.FICHA1;
		else
			return Messages.FICHA2;
	}
	
}
