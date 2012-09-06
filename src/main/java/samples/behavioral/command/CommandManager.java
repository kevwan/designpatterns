package samples.behavioral.command;

public interface CommandManager
{
	void clearCommands();
	void redoCommand();
	void storeCommand(Command command);
	void undoCommand();
}
