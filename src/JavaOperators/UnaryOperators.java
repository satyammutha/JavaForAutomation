package JavaOperators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		System.out.println("Post Increment:"+x++); //10(11)
		System.out.println("Pre Increment:"+ ++x); //12
		
		System.out.println("Post Decrement:"+x--); //12(11)
		System.out.println("Pre Decrement:"+ --x); //10
		
		System.out.println("\nSecond Example:");
		int a = 10;
		int b = 10;
		
		System.out.println(a++ + ++a); //10+12 = 22
		System.out.println(b-- - --b); //10-8 = 2
		
		System.out.println("\nThird Example of Negation ~ and Opposite !:");
		
		int c = 10;
		boolean d = false;
		System.out.println(~c); //-11 (minus of total positive value which starts from 0)
		System.out.println(!d); //true (opposite of boolean value)  
		
	}

}
