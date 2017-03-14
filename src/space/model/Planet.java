package space.model;

import java.util.Arrays;


public class Planet {
//Planets are round, so a square array will work it just needs to be distorted so it can be a circle by not using some of the results.
	private PlanetMap map;
	private double averageTemp;
	private double percentLand;
	private String dominantElement;
	private double gravity;
	private int radius;
	private boolean hasLife;
	private String name;
	//I'm not going to put garbage like atmospheric density. This is a basic rundown jeez.
	public Planet(int radius, double gravity, String element, double land, double temp, String name)
	{
		this.radius = radius;
		this.gravity = gravity;
		this.dominantElement = element;
		this.percentLand = land;
		this.averageTemp = temp;
		this.name = name;
		map = new PlanetMap((4 * radius));
		//Note: An area should be about 3x3 the units used for the radius so this finds the surface area for the sphere and then sqroots it to express it as a square
	}
	
	public String toString()
	{
		String output = "";
		output += "This planet is made of mostly " + dominantElement + ". It has a radius of " + radius 
				+ " meters. The gravitational acceleration is " + gravity + "m/s^2. The average surface temperature is " + averageTemp
				+ " degrees Celcius, and the surface has " + percentLand + " percent land.";
		if (hasLife)
		{
			output += " This planet also hosts life.";
		}
		return output;
	}
	
	public double getTemp()
	{
		return averageTemp;
	}
	public double getLand()
	{
		return percentLand;
	}
	public String getElement()
	{
		return dominantElement;
	}
	public double getGravity()
	{
		return gravity;
	}
	public int getRadius()
	{
		return radius;
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void climateChange(double tempChange)
	{
		this.averageTemp = tempChange;
	}
}
