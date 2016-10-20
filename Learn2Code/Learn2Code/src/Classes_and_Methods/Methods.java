package Classes_and_Methods;

public class Methods {

	public static void main(String[] args) {
		
		int value = calculate(5, 6);
				
		System.out.println(value);		
	}
	
	//Call outside of class, static: value is not gonna change, void: return type
	public static int calculate(int a, int b){
		
		int value;
		
		value = a * b;
		
		return value;
		
	}
}
