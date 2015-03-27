package yahtzee.model;

import yahtzee.view.IView;
import yahtzee.view.ScorePanel;

/**
* This class is a singleton class representing a score card for Yahtzee
* @author Kenneth Wang
*/
public class ScoreCard {
	private static ScoreCard scorecard = null; //single instance
	
	//constants to be used for all row parameters in this class
	/**constant for Aces row*/
	public static final String ACES = "Aces";
	/**constant for Twos row*/
	public static final String TWOS = "Twos";
	/**constant for Threes row*/
	public static final String THREES = "Threes";
	/**constant for Fours row*/	
	public static final String FOURS = "Fours";
	/**constant for Fives row*/
	public static final String FIVES = "Fives";
	/**constant for Sixes row*/
	public static final String SIXES = "Sixes";
	/**constant for Three of a Kind row*/
	public static final String THREE_OF_A_KIND = "3oak"; 
	/**constant for Four of a Kind row*/
	public static final String FOUR_OF_A_KIND = "4oak";
	/**constant for Full House row*/
	public static final String FULL_HOUSE = "Full House";
	/**constant for Small Straight row*/
	public static final String SMALL_STRAIGHT = "Small Straight";
	/**constant for Large Straight row*/
	public static final String LARGE_STRAIGHT = "Large Straight";
	/**constant for Yahtzee row*/
	public static final String YAHTZEE = "Yahtzee";
	/**constant for Chance row*/
	public static final String CHANCE = "Chance";
	
	//copy attributes from class diagram
	
	private ScorePanel scorePanel; //view
	
	/**
	* instantiates a scorecard, setting all values to zero
	*/
	private ScoreCard() {
		
	}
	
	/**
	* returns the single instance of scorecard
	* @return singleton instance of scorecard
	*/
	public static ScoreCard getInstance() {
		return null;
	}
	
	/**
	* resets all rows to zero
	*/
	public void reset() {
		
	}
	
	/**
	* sets a row to the appropriate score given the dice
	* @param row row to fill out
	* @param dice dice to get score from
	*/
	public void set( String row, DiceSet dice ) {
		//use getDistribution to determine the score
		//see DiceSet documentation
	}
	
	/**
	* fills out a row as a result of an extra Yahtzee
	* @param row row to fill out
	*/
	public void extraYahtzee( String row ) {
		
	}
	
	/**
	* returns the score of a given row
	* @param row row to return value of
	* @return value of desired row
	*/
	public int get( String row ) {
		return 0;
	}
	
	/**
	* returns the bonus score of this scorecard
	* @return 35 if the upper score is &gt;= 63 and 0 otherwise
	*/
	public int getBonus() {
		return 0;
	}
	
	/**
	* returns the total of the upper scorecard
	* @return total of upper scorecard
	*/
	public int getUpper() {
		return 0;
	}
	
	/**
	* returns the total of the lower scorecard
	* @return total of lower scorecard
	*/
	public int getLower() {
		return 0;
	}
	
	/**
	* returns the overall score of this card
	* @return overall score of this card
	*/
	public int getTotal() {
		return 0;
	}
	
	/**
	* registers the view representing this scorecard
	* @param view view to notify
	*/
	public void registerView( IView view ) {
		
	}
}