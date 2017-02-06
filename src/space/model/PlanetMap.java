package space.model;

import java.util.Arrays;

public class PlanetMap {
//It'll still use a 2D array, just with extra rules about accessing elements
private Area[][] map;
public PlanetMap(int size)
{
	Area[][] map = new Area[size][size];
}

public Area getArea(int y, int x)
{
	int X;
	int Y;
	for (Y = y; y > map.length; y -= map.length)
	{
		for (X = x; x > map[0].length; x -= map.length)
		{
			
		}
	}
	
	return null;
}
}
