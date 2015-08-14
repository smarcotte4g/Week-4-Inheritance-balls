package com.marcotte.inheritance_balls;

public abstract class Ball 
{
	// attributes
	protected short x;
	protected short y;
	protected float radius;
	
	// constructors
	public Ball() 
	{
		super();
		x = 0;
		y = 0;
		radius = 0.0f;
	}

	public Ball(short x, short y, float radius) {
		super();
		setX( x );
		setY( y );
		setRadius( radius );
	}
	
	// behaviors
	@Override
	public String toString() {
		return "Ball [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
	public abstract String bounce();	// abstract method
	
	// accessors and mutators
	public short getX() 
	{
		return x;
	}

	public void setX(short x) 
	{
		if(x > 0)
			this.x = x;
		else
			this.x = 0;
	}

	public short getY() 
	{
		return y;
	}

	public void setY(short y) 
	{
		if( y > 0)
			this.y = y;
		else
			this.y = 0;
	}

	public float getRadius() 
	{
		return radius;
	}

	public void setRadius(float radius) 
	{
		if(radius > 0.0f)
			this.radius = radius;
		else
			this.radius = 0.0f;
	}
	
}
