package week1.class2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 123;
		int sum = 0;
		while(input>0)
		{
			int rem = input%10;
			int quot = input/10;
			sum = sum + rem;
			input = quot;
			
		}
		System.out.println("number "+ sum);

	}

}
