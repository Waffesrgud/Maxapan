package space.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import space.view.SpaceFrame;
import space.view.SpacePanel;
import space.controller.Controller;

public class FrameTest
{
	private SpaceFrame testFrame;

	@Before
	public void setUp() throws Exception
	{
		testFrame = new SpaceFrame(new Controller());
	}

	@After
	public void tearDown() throws Exception
	{
		testFrame = null;
	}

	@Test
	public void testGridFrame()
	{
		assertNotNull("Data member not initialized", testFrame.getBaseController());
		assertTrue("Data member is of incorrect type", testFrame.getBaseController() instanceof Controller);
		assertNotNull("Data member not initialized", testFrame.getContentPane());
	}
	
	@Test
	public void testSetupFrame()
	{
		assertTrue("Title must be more than 5 characters long.", testFrame.getTitle().trim().length() > 5);
		assertTrue("Correct panel not installed", testFrame.getContentPane() instanceof SpacePanel);
		assertTrue("Minimum size not met", testFrame.getWidth() >= 500 && testFrame.getHeight() >= 500);
	}
	

}
