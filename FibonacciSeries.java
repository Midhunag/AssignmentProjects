package week1.class1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 0;
		int firstNum = 0;
		int secNum = 1;
	
		
		for(firstNum = 0; firstNum <=8;) {
			System.out.println(firstNum);
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}

	}

}
