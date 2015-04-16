package yahtzee.model;

import java.util.ArrayList;

public class Advisor {

	public Advisor(){
		
	}

	public ArrayList<Combination> getProbabilies(){
		
		boolean keepers[] = diceSet.getKeepers();
		ArrayList<Die> dices = new ArrayList<Die>();
		ArrayList<Combination> combinations = new ArrayList<Combination>();
		
		for(int i=0; i<5; i++)
		{
			if(keepers[i])
			{
				dices.add(diceSet.getDie(i));
			}
		}
		
		Combination yahtzee = new Combination("yahtzee", dices);
		combinations.add(yahtzee);
		
		
		return combinations;
	}
	
}
