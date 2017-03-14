package space.model;

import java.util.Arrays;
import space.model.*;

public class SolarSystem {
//This array will only be 1D, due to solar system's lack of solid-ish positioning so it'll just be closest to the sun to longest away
private Planet [] system;	
private String starType;
private int size;
private String name;

public SolarSystem(int size, String starType)
{
	system = new Planet[size];
	this.starType = starType;
	this.size = size;
}

public String toString()
{
	String output = "";
	output += "This is a solar system, with " + size 
			+ " major bodies orbitting the sun. The star that centers this system is a "
			+ starType + " type star.";
	return output;
}

public Planet[] getMap()
{
	return system;
}
public String getStar()
{
	return starType;
}
public String getName()
{
	return name;
}
public int getSize()
{
	return size;
}

public void setName(String name)
{
	this.name = name;
}

}
