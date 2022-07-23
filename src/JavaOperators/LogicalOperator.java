package JavaOperators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		System.out.println(a<b && a++<c); // false && true = false (second condition won't be checked)
		System.out.println(a<b || a++<c); // false || true = true (second condition won't be checked)
	}

}
