package com.marcotte.inheritance_balls;

import java.awt.Dimension;

import javax.swing.*;

public class Launcher {

	public static void main(String[] args) 
	{
		// launch our application
		SwingUtilities.invokeLater( new Runnable() {
		@Override
		public void run()
		{
			// launch the main form
			BallTestFrame app = new BallTestFrame("My Cool JFrame");
			app.setPreferredSize(new Dimension(400,400));
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			app.pack();
			app.setLocationRelativeTo(null);
			app.setVisible(true);
		}});

	}

}
