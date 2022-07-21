package JavaVariables;

public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 130;
		byte b = (byte)a;
		
		System.out.println("Before Overflow:"+a);
		System.out.println("After Overflow:"+b); //Will print -126 instead of 130
	}

}
