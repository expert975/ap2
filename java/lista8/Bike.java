public class Bike
{
	private Position position = new Position(); //only accessible by Bike
	private Speed speed = new Speed();

	public void accelerate(float speedChangeX, float speedChangeY)
	{
		speed.x = speedChangeX;
		speed.y = speedChangeY;
	}

	public void stop()
	{
		speed.x = 0;
		speed.y = 0;
	}

	public void move()
	{
		position.x += speed.x;
		position.y += speed.y;
	}

	public Speed getSpeed()
	{
		return speed;
	}

	public Position getPosition()
	{
		return position;
	}
}
