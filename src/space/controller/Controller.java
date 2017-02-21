package space.controller;

import space.view.SpaceFrame;
import space.model.*;

public class Controller {
	SpaceFrame overlay = new SpaceFrame(this);
	public Universe[][] universe;
	
	public static void main(String[] args)
	{
		System.out.println("Program running!");
	}
	
	public Controller()
	{
	Universe[][] universe = new Universe[10][10];
	}
	
	public Controller(int size)
	{
	Universe[][] universe = new Universe[size][size];
	}
	
	public Universe[][] getUniverse()
	{
		return universe;
	}
	
	public Universe[][] getGrid()
	{
		return universe;
	}

	public SpaceFrame getFrame() {
		return overlay;
	}
	
	
}
