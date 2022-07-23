package JavaControlStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int res = 0;
		boolean flag = false;
		
		int ch = 1;
		
		switch(ch) {
		case 1: res = a+b;
		break;
		case 2: res = a-b;
		break;
		case 3: res = a*b;
		break;
		case 4: res = a/b;
		break;
		default:
			System.out.println("Wrong Input");
			flag = true;
			break;
		}
		if(!flag)
		System.out.println(res);
	}

}
