package Classes;
import java.awt.Point;

public class Mainn {
	
	public static void main(String[] args) {
		
		Car myCar = new Car("Volkswagon", "Jetta", 5, 50, 5, Side.LEFT, new Point(0, 0), new Point(1,1));
		Car yourCar = new Car("Ford", "Fusion", 7, 75, 10, Side.RIGHT, new Point(50, 2), new Point(-2, 1));
		
		System.out.println("(" + myCar.getPos().getX() + ", " + myCar.getPos().getY() + ")");
		myCar.move(2);
		System.out.println("(" + myCar.getPos().getX() + ", " + myCar.getPos().getY() + ")");
		
		boolean crashed = false;
		
		while ((!myCar.isTankEmpty() || !yourCar.isTankEmpty()) && !crashed) {
			myCar.move(1);
			yourCar.move(1);
			
			if (myCar.getPos().equals(yourCar.getPos())) {
				System.out.println("CRASH!");
				crashed = true;
				
			}
			
		}
		
		if (!crashed) {
			System.out.println("ALIVE!");
		}
		
		//System.out.println(myCar.getDistance());
		
		//Forces the programmer to handle the error from throw
		//try {
		//	myCar.setMileage(-3);
		//} catch (Exception e) {
		//	e.printStackTrace();
		//};
		
		//System.out.println(myCar.company);
		//System.out.println(yourCar.company);
		//System.out.println(myCar.getMileage());
		
		//myCar.move(150);
		//myCar.move(50);
		//myCar.move(59);
		
		//myCar.refuel();
		
		//myCar.move(250);
		
		//myCar.refuel(25);
		//myCar.refuel(10);
		//myCar.refuel(40);
		
		//System.out.println(myCar.getDistance());
		
	}
}
