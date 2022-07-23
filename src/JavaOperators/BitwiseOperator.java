package JavaOperators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 30;
		
		System.out.println(a<b & a++<c); //false & true = false(second condition will be checked)
		System.out.println(a<b | a++<c); //false & true = true(second condition will be checked)
	}

}
