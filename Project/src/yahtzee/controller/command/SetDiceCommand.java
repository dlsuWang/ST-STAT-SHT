package yahtzee.controller.command;

import yahtzee.model.DiceSet;

/**
* This class represents a command saying to set the dice values.
* @author Austin Fernandez
*/
public class SetDiceCommand implements ICommand {
	private DiceSet diceSet;
	private int[] values;
	
	/**
	* basic constructor
	* @param diceSet dice to roll
	* @param values new values of the dice
	*/
	public SetDiceCommand( DiceSet diceSet, int[] values ) {
		this.diceSet = diceSet;
		this.values = values;
	}
	
	/**
	* sets the dice to the new provided values
	*/
	public void execute() {
		diceSet.setDice(values);
	}
}