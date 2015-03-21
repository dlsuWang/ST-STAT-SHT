package yahtzee.controller.command;

/**
* interface for command objects
* @author Austin Fernandez
*/
public interface ICommand {
	/**
	* execute the stored command
	*/
	public void execute();
}