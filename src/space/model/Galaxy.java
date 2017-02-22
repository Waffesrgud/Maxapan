package space.model;

import java.util.Arrays;


public class Galaxy {
	String shape;
	String name;
	int size1;
	int size2;
	public Galaxy(String shape, int size) {
		size2 = size;
		this.shape = shape;
		switch(shape)
		{
		case "SP":
			break;
		case "EX":
			size *= 2;
			size2 = size2 / 2;
			break;
		case "SO":
			break;
		case "IO":
			size = (int) (Math.random() * 3) * size / 2;
			size2 = (int) (Math.random() * 3) * size2 / 2;
			break;
		}

	SolarSystem [][] galacticMap = new SolarSystem[size][size2];

	}
	
	public String toString()
	{
		String shape = "";
		switch(name)
		{
		case "SO":
			shape = "Lenticular";
			break;
		case "EX":
			shape = "Elliptical";
			break;
		case "SP":
			shape = "Spiral";
			break;
		case "IO":
			shape = "Irregular";
			break;
		default:
			System.out.println("The galaxy is not being initialized properly, or it was tampered with!");
			break;
		}
		String output = "This is a galaxy, to be specific it is of the " + shape + " shape. It's size along an arbitrary x-axis and y-axis is " +
		Integer.toString(size2) + " x " + Integer.toString(size1)  + ". The center is some massive body that causes even stars to orbit around it.";
		
		
		return output;
	}
}
