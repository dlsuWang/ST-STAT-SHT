package yahtzee.controller.command;

/**
* an interface for a command to be executed by the controller
*/
public interface Command {
	/**
	* executes the selected command
	*/
	public void execute();
}