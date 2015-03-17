package yahtzee.model;

/**
* This class represents a regular fair six-sided die
*/
public class Die {
	private int value;
	
	/**
	* basic constructor; randomizes the initial value
	*/
	public Die() {
		roll();
	}
	
	/**
	* constructor for a die with set intial value
	* @param value value of die from 1 to 6 inclusive
	* @throws IllegalArgumentException when value is outside range [1,6]
	*/
	public Die( int value ) 
		throws IllegalArgumentException {
		setValue( value );
	}
	
	/**
	* rolls the die
	*/
	public void roll() {
		value = (int)(Math.random() * 6) + 1;
	}
	
	/**
	* returns the value of this die
	* @return value of this die
	*/
	public int getValue() {
		return value;
	}
	
	/**
	* sets the value of the die
	* @param value value of die from 1 to 6 inclusive
	* @throws IllegalArgumentException when value is outside range [1,6]
	*/
	public void setValue( int value ) 
		throws IllegalArgumentException {
		if( value >= 1 && value <= 6 ) {
			this.value = value;
		} else {
			throw new IllegalArgumentException( value + 
						" is outside the range [1,6]." );
		}
	}
	
	/**
	* returns this die's value as a string
	* @return value of die as string
	*/
	@Override
	public String toString() {
		return ( "Value: " + value );
	}
}