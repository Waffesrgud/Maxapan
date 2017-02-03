package space.model;

import java.util.Arrays;


public class Galaxy {
	String shape;
	String name;
	public Galaxy(String shape, int size) {
		int size2 = size;
		this.shape = shape;
		switch(shape)
		{
		case "SP":
			break;
		case "EX":
			size *= 2;
			size2 = size2 / 2;
			break;
		case "SB":
			break;
		case "IO":
			size = (int) (Math.random() * 3) * size / 2;
			size2 = (int) (Math.random() * 3) * size2 / 2;
			break;
		}

	SolarSystem [][] galacticMap = new SolarSystem[size][size2];


	}
}
