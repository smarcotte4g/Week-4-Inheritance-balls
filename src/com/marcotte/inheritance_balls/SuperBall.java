package com.marcotte.inheritance_balls;

import java.awt.Color;

public class SuperBall extends Ball 
{
	// attributes
	private Color ballColor;
	
	// constructors
	public SuperBall() 
	{
		super();
		// set child attribute
		ballColor = Color.WHITE;
	}

	public SuperBall(short x, short y, float radius, Color ballColor) 
	{
		super(x, y, radius);
		// set child attribute
		setBallColor(ballColor);
	}
	
	//behaviors
	@Override
	public String bounce() 
	{
		// show the bounce information
		return "Superball: where did that ball go??";
	}

	@Override
	public String toString() {
		return "SuperBall [x=" + x + ", y=" + y + ", radius=" + radius
				+ ", ballColor=" + ballColor + "]";
	}
	
	// accessors and mutators
	public Color getBallColor() 
	{
		return ballColor;
	}

	public void setBallColor(Color ballColor) 
	{
		this.ballColor = ballColor;
	}

}
