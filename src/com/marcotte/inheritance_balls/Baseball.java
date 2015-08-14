package com.marcotte.inheritance_balls;

public class Baseball extends Ball 
{
	// attributes
	private boolean regulation;
	
	// constructors
	public Baseball() 
	{
		super();
		// set the child value only
		regulation = false;
	}

	public Baseball(short x, short y, float radius, boolean regulation) 
	{
		super(x, y, radius);
		// set the child value only
		setRegulation(regulation);
	}

	//behaviors
	@Override
	public String bounce() 
	{
		// show the bounce sound for the baseball
		return "Baseball: small and hard bounce...";
	}

	@Override
	public String toString() {
		return "Baseball [x=" + x + ", y=" + y + ", radius=" + radius
				+ ", regulation=" + regulation + "]";
	}

	// accessors and mutators
	public boolean isRegulation() 
	{
		return regulation;
	}

	public void setRegulation(boolean regulation) 
	{
		this.regulation = regulation;
	}

}
