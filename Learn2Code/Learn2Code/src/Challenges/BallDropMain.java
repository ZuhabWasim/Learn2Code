package Challenges;

import java.util.Scanner;

public class BallDropMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		final double GRAVITY = 9.8;
		String city;
		int mass;
		double drag;
		
		String greatestCity = "";
		double greatestVelocity = 0;
		
		
		for(int i = 0; i < n; i++) {
			
			String[] input = sc.nextLine().split(", ");
			city = input[0];
			mass = Integer.parseInt(input[1]);
			drag = Double.parseDouble(input[2]);
			
			BallDrop thisBallDrop = new BallDrop(city, mass, drag, GRAVITY);
			
			thisBallDrop.setHeight(mass);
			thisBallDrop.setTime(thisBallDrop.getHeight(), thisBallDrop.getGravity(), thisBallDrop.getDrag());
			thisBallDrop.setVelocity(thisBallDrop.getGravity(), thisBallDrop.getDrag(), thisBallDrop.getTime());
			
			if (thisBallDrop.getVelocity() > greatestVelocity) {
				greatestCity = thisBallDrop.getCity();
				greatestVelocity = thisBallDrop.getVelocity();
			}
		}
		
		String output = greatestCity + ", " + Math.round(greatestVelocity) + " m/s";
		System.out.println(output);
		
		sc.close();

	}
}
