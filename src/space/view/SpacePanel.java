package space.view;

import space.controller.Controller;
import javax.swing.*;

import space.controller.Controller;

import java.awt.event.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class SpacePanel extends JPanel {

	public Controller baseController;

	
	public SpacePanel(Controller baseController) {
	super();
	setBackground(new Color(25, 25, 112));
	setToolTipText("");
	setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
	this.baseController = baseController;
	SpringLayout springLayout = new SpringLayout();
	setLayout(springLayout);
	JScrollPane scrollPane = new JScrollPane();
	springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.WEST, scrollPane, 175, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, this);
	springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, this);
	scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	setupLayout();
	add(scrollPane);
	
	JTextArea description = new JTextArea();
	description.setLineWrap(true);
	description.setBackground(new Color(0, 191, 255));
	springLayout.putConstraint(SpringLayout.NORTH, description, 0, SpringLayout.NORTH, scrollPane);
	springLayout.putConstraint(SpringLayout.WEST, description, 10, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, description, -88, SpringLayout.SOUTH, scrollPane);
	springLayout.putConstraint(SpringLayout.EAST, description, -10, SpringLayout.WEST, scrollPane);
	description.setText("toString area");
	description.setRows(20);
	description.setColumns(1);
	add(description);
	
	JButton up = new JButton("^");
	springLayout.putConstraint(SpringLayout.NORTH, up, 200, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.WEST, up, 122, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.EAST, up, -32, SpringLayout.WEST, scrollPane);
	add(up);
	
	JButton down = new JButton("v");
	springLayout.putConstraint(SpringLayout.NORTH, down, 6, SpringLayout.SOUTH, up);
	springLayout.putConstraint(SpringLayout.WEST, down, 122, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, down, -28, SpringLayout.SOUTH, this);
	springLayout.putConstraint(SpringLayout.EAST, down, 0, SpringLayout.EAST, up);
	add(down);
	
	JButton left = new JButton("<");
	springLayout.putConstraint(SpringLayout.WEST, left, 95, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.EAST, left, -6, SpringLayout.WEST, down);
	add(left);
	
	JButton right = new JButton(">");
	springLayout.putConstraint(SpringLayout.NORTH, right, 235, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.WEST, right, 6, SpringLayout.EAST, down);
	springLayout.putConstraint(SpringLayout.EAST, right, -5, SpringLayout.WEST, scrollPane);
	add(right);
	
	JButton btnEnter = new JButton("enter");
	springLayout.putConstraint(SpringLayout.WEST, btnEnter, 10, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, btnEnter, 0, SpringLayout.SOUTH, up);
	springLayout.putConstraint(SpringLayout.EAST, btnEnter, -47, SpringLayout.WEST, up);
	add(btnEnter);
	
	JButton btnNewButton = new JButton("New button");
	springLayout.putConstraint(SpringLayout.NORTH, left, 206, SpringLayout.SOUTH, btnNewButton);
	add(btnNewButton);
	}
	
	public void setupPanel()
	{
		
	}
	public void setupLayout()
	{

	}
	public void setupListeners()
	{
		
	}
}
