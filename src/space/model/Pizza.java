package space.model;

public class Pizza implements Liftable{
	private boolean hasSpikes;
	private boolean isHot;
	private int weight;
	private boolean exists;
	private boolean canBeTouched;
	public Pizza()
	{
		hasSpikes = false;
		isHot = false;
		weight = 4;
		exists = true;
		canBeTouched = true;
	}
}
