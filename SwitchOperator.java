package week1.class2;

public class SwitchOperator {
public static void main(String[] args) {
	int a = 5;
	int b = 2;
	char addNum = '+'; 
	switch (addNum) {
	case '-':
		int c = a - b;
		System.out.println("Subtraction value " + c);	
		break;
	case '+':
		int d = a + b;
		System.out.println("Addition value " + d);	
		break;

	default:
		System.out.println("invalid value " );	
		break;
	}
	
	}
}

