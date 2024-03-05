package gp.control;

import java.util.Scanner;

import gp.logic.Game;
import gp.view.BoardPrinter;
import gp.view.GamePrinter;

public class Controller {

	private Game game;
	private Scanner scanner;
	private GamePrinter printer;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		printer = new BoardPrinter(game);
	}


	public void run(){
		
		printGame();

	}
	
	/**
	 * Draws/prints the game
	 */
	private void printGame() {
		System.out.println(printer);
	}

}
