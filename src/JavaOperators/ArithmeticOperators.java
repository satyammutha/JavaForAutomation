package JavaOperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(a%b); //0
		
		System.out.println("\nSecond Expression Example:");
		
		System.out.println(10*10/5+3-1*4/2); //21
		
		/*
		 * Java Precedence (*)/%+-
		 * 10*10=100 & 1*4=4 -> (100/5+3-4/2)
		 * 100/5=20 & 4/2=2 -> (20+3-2)
		 * 20+3=23 -> (23-2)
		 * => 21
		 */
	}

}
