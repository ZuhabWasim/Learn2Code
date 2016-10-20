package Challenges;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double n = Integer.parseInt(sc.nextLine());
		
		int tries = 0;
		
		do {
			n = (n % 2 == 0) ? n / 2 : (n * 3) + 1;
			tries += 1;
		} while ((int) n != 1);
		
		System.out.println(tries);
		
		sc.close();
		
	}

}