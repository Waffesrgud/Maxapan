package space.model;

import java.util.Arrays;

public class PlanetMap {
//It'll still use a 2D array, just with extra rules about accessing elements
private Area[][] map;
public PlanetMap(int size)
{
	Area[][] map = new Area[size][size];
}

public Area getAreaFromPole(int y, int x)
{
	int Y = y;
	int X = x;
	while (Y > map.length)
	{
		Y -= map.length;
	}
	while (X > map[0].length)
	{
		X -= map[0].length;
	}
	
	return map[Y][X];
}

}
