package Challenges;

public class BallDrop {
	
	//Fields
	private String city;
	private int mass;
	private double drag;
	
	private double height;
	private double velocity;
	private double gravity;
	private double time;
	
	//Constructor
	public BallDrop(String city, int mass, double drag, double gravity) {
		
		this.city = city;
		this.mass = mass;
		this.drag = drag;
		
		this.gravity = 9.8;
		
	}

	//Getters and Setters
	
	public double getHeight() {
		return height;
	}

	public void setHeight(int mass) {
		this.height = 1000 / Math.sqrt(mass);
	}


	public double getVelocity() {
		return velocity;
	}


	public void setVelocity(double gravity, double drag, double time) {
		this.velocity = (gravity - drag) * time;
	}


	public double getTime() {
		return time;
	}


	public void setTime(double height, double gravity, double drag) {
		this.time = Math.sqrt((2 * height) / (gravity - drag));
	}

	////////////////////////////////////////
	public String getCity() {
		return city;
	}


	public int getMass() {
		return mass;
	}


	public double getDrag() {
		return drag;
	}


	public double getGravity() {
		return gravity;
	}
	
	
}
