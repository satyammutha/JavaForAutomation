package JavaVariables;

public class AddingLowerType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		//byte c = a + b; //will be compile-time error
		
		byte c = (byte)(a+b);
		System.out.println(c);
	}

}
