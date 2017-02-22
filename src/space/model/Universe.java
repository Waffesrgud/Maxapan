package space.model;

import java.util.Arrays;

public class Universe {
	Galaxy[][] universeMap;
	
	public Universe(int size)
	{
		Galaxy [][] universeMap = new Galaxy[size][size];
	}
	
	public String toString()
	{
		String output = "";
		output = "The universe. There is only one of these, so try to get used to it. The size of the universe by the grid scale is "
				+ Integer.toString(universeMap.length) + " x " + Integer.toString(universeMap.length)
				+ " and it is like any other universe: big, empty, cold and black. But it's got nice parts, I suppose.";
		return output;
	}
	
	public Universe get()
	{
		return this;
	}
}
