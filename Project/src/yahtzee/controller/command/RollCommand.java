package yahtzee.controller.command;

import yahtzee.model.DiceSet;

/**
* This class represents a command saying to roll the dice.
* @author Austin Fernandez
*/
public class RollCommand implements ICommand {
	private DiceSet diceSet;
	private boolean[] diceToKeep;
	
	/**
	* basic constructor
	* @param diceSet dice to roll
	* @param diceToKeep boolean values for each die re: whether to keep them or
	* 					not
	*/
	public RollCommand( DiceSet diceSet, boolean[] diceToKeep ) {
		this.diceSet = diceSet;
		this.diceToKeep = diceToKeep;
	}
	
	/**
	* rolls the dice not kept as described by the objects attributes
	*/
	public void execute() {
		diceSet.setKeepers(diceToKeep);
		diceSet.roll();
	}
}