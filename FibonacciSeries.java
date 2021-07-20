package week1.class1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		System.out.println(secNum);

		for (int i = 2; i < 8; i++) {
			// System.out.println(firstNum);
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}

	}

}

