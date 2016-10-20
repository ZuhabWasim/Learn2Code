package Challenges;

//import java.util.Scanner;

public class Alarm_System {
	
	
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		int time;
		boolean door_opened;
		boolean window_opened;
		int sensor;
		String combination_entered;
		String combination_correct;
		
		time = 13;
		door_opened = true;
		window_opened = false;
		sensor = 5;
		combination_entered = "1023";
		combination_correct = "1023";
		
		if (alarmGoOff(time, door_opened, window_opened, sensor, combination_entered, combination_correct)) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		//sc.close();
	}
	
	public static boolean alarmGoOff(int t, boolean d, boolean w, int s, String c_e, String c_c) {
		
		return (d && c_e != c_c) || (d && (t >= 23 && t <= 4)) || (s > 8 && (t >= 22 && t <= 5)) || (s == 10) ? true : false;
		
	}
}
