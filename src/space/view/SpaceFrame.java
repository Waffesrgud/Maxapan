package space.view;

import javax.swing.JFrame;
import space.controller.Controller;
import javax.swing.*;
import java.awt.Dimension;

public class SpaceFrame extends JFrame
{
private Controller baseController;
private SpacePanel appPanel;

public SpaceFrame(Controller baseController)
{
	super();
	this.appPanel = new SpacePanel(baseController);
	this.baseController = baseController;
	this.setSize(new Dimension(800,600));
	this.setTitle("Space V-0.0.1");
	this.add(appPanel);
	this.setVisible(true);	
}

public Controller getBaseController()
{
	return baseController;
}

public SpacePanel getPanel()
{
	return appPanel;
}

public SpaceFrame getFrame()
{
	return this;
}
}
