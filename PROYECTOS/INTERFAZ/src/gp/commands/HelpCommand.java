package gp.commands;

import gp.logic.Game;
import gp.view.Messages;

public class HelpCommand extends NoParamsCommand {

	@Override
	protected String getName() {
		return Messages.COMMAND_HELP_NAME;
	}

	@Override
	protected String getShortcut() {
		return Messages.COMMAND_HELP_SHORTCUT;
	}

	@Override
	protected String getDetails() {
		return Messages.COMMAND_HELP_DETAILS;
	}

	@Override
	protected String getHelp() {
		return Messages.COMMAND_HELP_HELP;
	}

	@Override
	public boolean execute(Game game) {
		System.out.println(Messages.HELP_AVAILABLE_COMMANDS);		
		System.out.println(CommandGenerator.commandHelp());
		return false;
	}

}