package com.marcotte.inheritance_balls;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BallTestFrame extends JFrame implements ActionListener 
{
	// class level references
	private JPanel pnlTop;
	private JButton btnRun;
	private JTextArea txaOutput;
	
	public BallTestFrame(String title)
	{
		super(title);
		
		// create the frame
		pnlTop = new JPanel(new FlowLayout());
		btnRun = new JButton("Run");
		btnRun.addActionListener(this);
		pnlTop.add(btnRun);
		
		txaOutput = new JTextArea();
		JScrollPane scrPane = new JScrollPane(txaOutput);
		
		this.add(pnlTop, BorderLayout.NORTH);
		this.add(scrPane);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// create an array of balls ( object array)
		// use polymorphism -- poly means many and morph changes into
		Ball[] balls = new Ball[3];
		balls[0] = new SuperBall((short)50, (short)50, 0.5f, Color.MAGENTA);
		balls[1]= new Baseball((short)50, (short)100, 1.5f, true);
		balls[2]= new SuperBall((short)50, (short)150, 0.5f, Color.CYAN);
		
		// show the balls using a single loop
		for(short i = 0; i < balls.length; i++)
		{
			txaOutput.append("location:	" + balls[i].getX() + ", " + balls[i].getY() + "\n");
			txaOutput.append("Radius: " + balls[i].getRadius() + "\n");
			txaOutput.append("Bounce: " + balls[i].bounce() + "\n");
			
			// get child attributes values
			if(balls[i].getClass() == new SuperBall().getClass())
			{
				SuperBall temp = (SuperBall)balls[i];
				txaOutput.append("Color: " + showColor(temp.getBallColor()) + "\n");
			}
			else if(balls[i].getClass() == new Baseball().getClass())
			{
				Baseball temp = (Baseball)balls[i];
				txaOutput.append("Regulation: " + temp.isRegulation() + "\n");
			}
			else
			{
				txaOutput.append("Unknown child class.\n");
			}
			
			// blank
			txaOutput.append("\n");
		}
		

	}

	private String showColor(Color ballColor) 
	{
		// return the human color
		if(ballColor.equals(Color.RED))
			return "red";
		else if(ballColor.equals(Color.BLACK))
			return "Black";
		else if(ballColor.equals(Color.MAGENTA))
			return "Magenta";
		else if(ballColor.equals(Color.CYAN))
			return "Cyan";
		else
			return "Unknown";
	}

}
