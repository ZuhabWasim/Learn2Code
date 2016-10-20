package Conditionals;

public class If_Statements {

	public static void main(String[] args) {
		//If Statements
		//= : Assignment, += : adds the num, 
		//Conditional Operators, And = &&, Or = ||
		
		int valNum = 3;
				
		valNum *= 5;
		
		if(valNum == 8){
			System.out.println("Hello World");
		}else{
			System.out.println(valNum);
		}
		
		/////////Practice/////////////// 
		
		/* Billy has 5 oranges,
		 * on the first day he gets 3 more oranges
		 * and 5 new apples
		 * if Billy has more than 7 oranges and 5 apples
		 * say that he has 5 dollars
		 * if he has exactly  5 apples, say 'amazing'
		 * other wise say 'broke'
		 */
		
		boolean yesNo;
		int berry;

		//starting day
		int oranges = 5;
		int apples = 0;
		
		//first day
		oranges += 3;
		apples += 5;
		
		if (oranges > 7 || apples > 5){
			System.out.println("Billy has 5 dollars.");
		}else if (apples == 5){
			System.out.println("Amazing!");	
		}else{
			System.out.println("He is broke!");
		}
		
		System.out.println();
		
		//Turnerary operators
		//var = (condition) ? val if condition is true : val if not true
		yesNo = 1 > 2 ? false : true;
		
		berry = (oranges > apples) ? 5 : 3;
		
		System.out.println(berry);
		
	}

}
