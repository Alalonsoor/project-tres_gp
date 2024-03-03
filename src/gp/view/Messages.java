package gp.view;

public class Messages {
	//Welcome
	public static final String GAME_NAME = "Cuatro en Raya Fury";
	public static final String CLASSIC = "Clásico";
	public static final String WELCOME = String.format("%s %s%n", GAME_NAME, CLASSIC);
	public static final String PROMPT = "Command > ";
	public static final String LINE_SEPARATOR = System.lineSeparator();
	public static final String HELP_AVAILABLE_COMMANDS = "Available commands: ";
	public static final String PLAYER_1_WINS = "Player 1 win!";
	public static final String PLAYER_2_WINS = "Player 2 wins!";
	public static final String DEBUG = "%n[DEBUG] Executing: %s%n";
	public static final String NUMBER_OF_CYCLES = "Number of cycles:";
	
	//GameObject
	public static final String FICHA1 = "X";
	public static final String FICHA2 = "O";
		
		
	//Commands
	
	public static final String COMMAND_EXIT_NAME = "exit";
	public static final String COMMAND_EXIT_SHORTCUT = "e";
	public static final String COMMAND_EXIT_DETAILS = "[e]xit";
	public static final String COMMAND_EXIT_HELP = "exits the game";

	public static final String COMMAND_HELP_NAME = "help";
	public static final String COMMAND_HELP_SHORTCUT = "h";
	public static final String COMMAND_HELP_DETAILS = "[h]elp";
	public static final String COMMAND_HELP_HELP = "shows this help";
		
	public static final String COMMAND_MOVE_NAME = "move";
	public static final String COMMAND_MOVE_SHORTCUT = "m";
	//public static final String COMMAND_MOVE_DETAILS = "[m]ove " + ALLOWED_UCMSHIP_MOVES;
	public static final String COMMAND_MOVE_HELP = "moves the UCMShip in the indicated direction";
		
	public static final String COMMAND_RESET_NAME = "reset";
	public static final String COMMAND_RESET_SHORTCUT = "r";
	public static final String COMMAND_RESET_DETAILS = "[r]eset [filename]";
	public static final String COMMAND_RESET_HELP = "resets the game using the initial configuration in file filename. If no file is given the standard configuration is used";
	
	public static final String POSITION = "(%s, %s)";
	public static final String OFF_WORLD_MESSAGE = "Cannot move in direction %s from position %s";
	public static final String OFF_WORLD_POSITION = "Position %s is off board";
	
	
	public static final String debug(String message) {
		return Messages.DEBUG.formatted(message);
	}
}

