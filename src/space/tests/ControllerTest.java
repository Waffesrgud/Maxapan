package space.tests;

import static org.junit.Assert.*;

import org.junit.*;
import space.controller.Controller;
import space.view.SpaceFrame;

/*
NOTE: I REPLACED EVERY INSTANCE OF GRID WITH SPACE AND REMOVED SOME GRIDS
THESE CHANGES ARE MERELY PLATONIC
NO HARM
*/

public class ControllerTest
{
	private Controller testController;
	
	@Before
	public void setUp() throws Exception
	{
		testController = new Controller();
	}
	
	@After
	public void tearDown() throws Exception
	{
		testController = null;
	}
	
	@Test
	public void testGridController()
	{
		assertNotNull("Two Dimensional grid needs to exist", testController.getGrid());
		assertTrue("2D Grid needs at least 5 rows", testController.getGrid().length > 4);
		assertTrue("2D Grid needs at least 5 columns", testController.getGrid()[0].length >= 5);
		assertNotNull("GUI exists", testController.getFrame());
		assertTrue("GUI Frame is not of correct type", testController.getFrame() instanceof SpaceFrame);
	}
	
	@Test
	public void testGridModel()
	{
		for (int row = 0; row < testController.getGrid().length; row++)
		{
			for (int col = 0; col < testController.getGrid()[0].length; col++)
			{
				assertNotNull("Contents of grid must exist", testController.getGrid()[row][col]);
				assertFalse("@ symbol means default toString is in use", testController.getGrid()[row][col].toString().contains("@"));
				assertTrue("The toString method is long enough", testController.getGrid()[row][col].toString().length() > 5);
			}
		}
	}

}
