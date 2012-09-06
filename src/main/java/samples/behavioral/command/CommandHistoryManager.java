package samples.behavioral.command;

import java.util.Stack;

public class CommandHistoryManager implements CommandManager
{
	private final Stack<Command> commands = new Stack<Command>();
	private final Stack<Command> undoCommands = new Stack<Command>();

	public void clearCommands()
	{
		commands.clear();
	}

	public void redoCommand()
	{
		if (undoCommands.isEmpty())
		{
			return;
		}
		Command command = undoCommands.pop();
		command.redo();
		commands.add(command);
	}

	public void storeCommand(Command command)
	{
		commands.add(command);
	}

	public void undoCommand()
	{
		if (commands.isEmpty())
		{
			return;
		}
		Command command = commands.pop();
		command.undo();
		undoCommands.push(command);
	}

}
