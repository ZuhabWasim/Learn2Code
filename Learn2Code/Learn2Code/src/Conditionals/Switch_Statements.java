package Conditionals;

public class Switch_Statements {

	public static void main(String[] args) {
		
		
		//Switch Statements
		
		int wheels = 2;
		int gears = 5;
		
		switch (wheels) {
		case 1:
			gears -= 1;
			break;
		case 2:
			gears += 1;
			break;
		default:
			gears *= 3;
			break;
		}
		
		
		System.out.println(gears);
		System.out.println("Out of switch case.");
		
		//////////Practice//////////
		System.out.println("");
		System.out.println("Practice");
		
		/*Billy has 8 oranges, and 5 apples
		 * if he has 6 apples, or 5 apples or 10 apples, or >3 apples
		 * say "Wow so many apples"
		 * otherwise say "Not so many apples"
		 */
		
		int oranges = 8;
		int apples = 5;
		
		switch (apples){
		case 5: case 6: case 10:
			System.out.println("Wow, so many apples!");
			break;
		case 1: case 2: case 3:
			System.out.println("Not so many apples.");
			break;
		default:
			System.out.println("Invalid apples!");
			break;
		}
		
	}

}
