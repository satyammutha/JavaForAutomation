package JavaControlStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		int marks = 40;
		
		if(marks >= 70 && marks<=100) {
			System.out.println("Distinction");
		}
		else if(marks>=60 && marks <=69) {
			System.out.println("First Class");
		}
		else if(marks>=50 && marks <=59) {
			System.out.println("Second Class");
		}
		else if(marks>=40 && marks <=49) {
			System.out.println("Pass Class");
		}
		else if(marks>=0 && marks <=39) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Wrong input");
		}

	}

}
