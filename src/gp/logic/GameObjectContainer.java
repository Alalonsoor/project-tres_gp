package gp.logic;

import java.util.List;

import gp.GameObjects.GameObject;
import gp.exceptions.FullColumnException;
import gp.view.Messages;

import java.util.ArrayList;

public class GameObjectContainer {
	private List<GameObject> objects;
	
	public GameObjectContainer() {
		objects = new ArrayList<>();
	}
	
	public String toString(Position position) {
		String obj=" ";
		int i=0;
		
		while(obj==" " && i<objects.size()) {
			GameObject c=objects.get(i);
			obj = c.toString(c,position);
			i++;
		}
		return obj;
	}

	public void add(GameObject object) {
		objects.add(object);
	}
	
	public int findRow(int col) throws FullColumnException{
		boolean find = false;
		int i = 0;
		int row = 5;
		while(!find &&  i<objects.size()) {
			GameObject c=objects.get(i);
			Position p = new Position(col, row);
			if(c.isOnPosition(p)) {
				find = true;
			}
			else {
				i++;
				row--;
			}
		}
		if(!find) {
			return row;
		}
		else throw new FullColumnException(Messages.FULL_COLUMN_MESSAGE.formatted(col));

		
	}
}
