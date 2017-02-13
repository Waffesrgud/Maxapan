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
	setBackground(new Color(0, 0, 128));
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
	springLayout.putConstraint(SpringLayout.NORTH, description, 0, SpringLayout.NORTH, scrollPane);
	springLayout.putConstraint(SpringLayout.WEST, description, 10, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, description, -88, SpringLayout.SOUTH, scrollPane);
	springLayout.putConstraint(SpringLayout.EAST, description, -10, SpringLayout.WEST, scrollPane);
	description.setLineWrap(true);
	description.setBackground(new Color(0, 191, 255));
	description.setText("toString area");
	description.setRows(20);
	description.setColumns(1);
	add(description);
	
	JButton up = new JButton("^");
	up.setBackground(new Color(255, 105, 180));
	add(up);
	
	JButton down = new JButton("v");
	springLayout.putConstraint(SpringLayout.WEST, down, 37, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.WEST, up, 0, SpringLayout.WEST, down);
	springLayout.putConstraint(SpringLayout.SOUTH, up, -6, SpringLayout.NORTH, down);
	springLayout.putConstraint(SpringLayout.EAST, up, 0, SpringLayout.EAST, down);
	springLayout.putConstraint(SpringLayout.SOUTH, down, 0, SpringLayout.SOUTH, scrollPane);
	down.setBackground(new Color(255, 105, 180));
	add(down);
	
	JButton left = new JButton("<");
	springLayout.putConstraint(SpringLayout.NORTH, left, 0, SpringLayout.NORTH, down);
	springLayout.putConstraint(SpringLayout.WEST, left, 0, SpringLayout.WEST, description);
	springLayout.putConstraint(SpringLayout.EAST, left, -6, SpringLayout.WEST, down);
	left.setBackground(new Color(255, 105, 180));
	add(left);
	
	JButton right = new JButton(">");
	springLayout.putConstraint(SpringLayout.WEST, right, 64, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.EAST, down, -6, SpringLayout.WEST, right);
	springLayout.putConstraint(SpringLayout.NORTH, right, 0, SpringLayout.NORTH, down);
	springLayout.putConstraint(SpringLayout.EAST, right, -90, SpringLayout.WEST, scrollPane);
	right.setBackground(new Color(255, 105, 180));
	add(right);
	
	JButton btnEnter = new JButton("enter");
	springLayout.putConstraint(SpringLayout.WEST, btnEnter, 94, SpringLayout.WEST, description);
	springLayout.putConstraint(SpringLayout.SOUTH, btnEnter, 0, SpringLayout.SOUTH, scrollPane);
	springLayout.putConstraint(SpringLayout.EAST, btnEnter, -6, SpringLayout.WEST, scrollPane);
	btnEnter.setBackground(new Color(0, 191, 255));
	add(btnEnter);
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
