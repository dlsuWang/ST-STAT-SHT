package yahtzee.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination {

	private String name;
	private int value;
	private double probability;
	private ArrayList<Die> dices;
	double[] probabilities;
	boolean match;
	
	public static void main(String[] args){
		
		ArrayList<Die> dices = new ArrayList<Die>();
		Die two = new Die(2);
		dices.add(two);
		dices.add(two);
		dices.add(two);
		dices.add(two);
		//dices.add(two);
		
		Combination yahtzee = new Combination("yahtzee", dices);
		System.out.println(yahtzee.getProbability());
		System.out.println(yahtzee.getValue());
		
	}
	
	
	public Combination(String name, ArrayList<Die> dices) {
		this.name = name;
		this.dices = dices;
		match = true;
		value = 0;
		probability = 0;
		probabilities = new double[6];
		
		if(name.equals("yahtzee"))
		{
			setYahtzee();			
		}

	}

	public void setYahtzee(){
		
		int exponent = 0, i;
		
		if(dices.size() != 5)
		{
			int[] dist = new int[6];
			
			for(Die d: dices)
			{
				dist[d.getValue()-1]++;
			}
			
			
			for(i=0; i < dices.size(); i++)
			{
				if(dices.get(0).getValue() != dices.get(i).getValue())
				{
					match = false;
				}
			}
			
			if(!match)
			{
				for(i=0; i < 6; i++)
				{
					probabilities[i] = 0;
				}
			}
			
			else
			{
				for(i=0; i<6; i++)
				{
					exponent = 5 - dist[i];
					probabilities[i] = Math.pow(1.0/6, exponent);
				}
					
			}	
			
			this.probability = getMax();
			this.value = getIndex(this.probability)+1;
			
		}
		
	}
	
	public double getMax()
	{
		if(!match)
		{
			return 0;
		}
		
		double[] array = probabilities.clone();
		Arrays.sort(array);
		return array[array.length-1];
		
	}

	public int getIndex(double num)
	{
		int i;
		
		if(!match)
		{
			return 0;
		}
		
		for(i=0; i<probabilities.length; i++)
		{
			if(probabilities[i] == num)
			{
				return i;
			}
		}
		return 0;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}
	
}
