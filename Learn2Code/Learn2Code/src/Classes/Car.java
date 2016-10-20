package Classes;
import java.awt.Point;

public class Car {
	
	//fields
	private String company;
	private String make;
	
	private int seats;
	
	private double fuelCapacity;
	
	private double fuelTank;
	
	//miles 1 can travel with 1 litre
	private double mileage;
	
	private Side side;
	
	private int distanceFromFactory;
	
	private Point pos;
	
	private Point slope;
	
	//Car myCar = new Car("Volkswagon", "Jetta", 5, 50, 5, Side.LEFT);
	
	//constructor
	public Car(String company, String make, int seats, double fuelCapacity, double mileage, Side side, Point pos, Point slope) {
		this(company, make, seats, fuelCapacity, mileage, pos, slope);
		
		this.side = side;
	}
	
	public Car(String company, String make, int seats, double fuelCapacity, double mileage, Point pos, Point slope) {
		this.company = company;
		this.make = make;
		
		this.seats = seats;
		
		this.fuelCapacity = fuelCapacity;
		this.fuelTank = fuelCapacity;
		
		this.mileage = mileage;
		
		this.side = side.LEFT;
		
		
		this.distanceFromFactory = 0;
		
		this.pos = pos;
		this.slope = slope;
		
		
	}
	
	public Point getPos() {
		return pos;
	}



	public void move(double units) {
		if (fuelTank > 0) {
			
			double maxUnits = fuelTank * mileage;
			
			double distanceTravelled = 0;
			
			if (units >= maxUnits) {
				distanceTravelled = Math.sqrt(Math.pow((maxUnits * slope.getX()), 2) + Math.pow((maxUnits * slope.getY()), 2));
				distanceFromFactory += distanceTravelled;
				
				
				//position: (3, 2)
				//Distance: 3
				//(5, 3)
				
				pos.setLocation(pos.getX() + slope.getX() * maxUnits, pos.getY() + slope.getY() * maxUnits);
				fuelTank = 0;
				
				System.out.println(company + " " + make + " has travelled " + distanceTravelled + " miles and has ran out of fuel, refuel it");
			
			} else {
				distanceTravelled = Math.sqrt(Math.pow((units * slope.getX()), 2) + Math.pow((units * slope.getY()), 2));
				distanceFromFactory += distanceTravelled;
				
				pos.setLocation(pos.getX() + slope.getX() * units, pos.getY() + slope.getY() * units);
				
				this.fuelTank -= units / mileage;
				
				System.out.println(company + " " + make + " has travelled " + distanceTravelled + " miles.");
		
			}
			
			//System.out.println(fuelTank);
		} else {
			System.out.println(company + " " + make + " has no fuel.");
		}
	}
	
	public boolean isTankEmpty() {
			return (fuelTank <= 0);
	}
	public void refuel() {
		fuelTank = fuelCapacity;
	}
	
	public void refuel(double fuel) {
		double extraFuel = (fuelTank + fuel) - fuelCapacity;
		
		System.out.println("Extra fuel: " + extraFuel);
		
		if (extraFuel > 0) {
			fuelTank += (fuel - extraFuel);
		} else {
			fuelTank += fuel;
		}
		
		System.out.println("Filled tank to " + fuelTank + ".");
		
	}
	public int getDistance() {
		return distanceFromFactory;
	}

	public void setDistance(int distance) {
		this.distanceFromFactory = distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String getCompany() {
			return this.company;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(double fuelTank) {
		this.fuelTank = fuelTank;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) throws Exception {
		if (mileage < 0) {
			throw new Exception("Mileage must be greater than 0");
			//this.mileage = mileage;
		}
		
		this.mileage = mileage;
		
		//System.err.println("Mileage must be greater than 0");
		
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public void setCompany(String company) {
			this.company = company;
			
	}

}
