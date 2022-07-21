package JavaVariables;

public class typesOfVariables {

	static int staticA = 10; //Static Variable
	
	public void methodTest() {
		int localB = 20; //Local Variable
		System.out.println("Printing Local Variable:"+localB);
	}
	
	public static void main(String[] args) {
		int instanceC = 30; //Instance Variable
		
		System.out.println("Printing Static Variable:"+staticA);
		
		typesOfVariables t = new typesOfVariables();
		t.methodTest();
		
		System.out.println("Printing Instance Variable:"+instanceC);
	}

}
