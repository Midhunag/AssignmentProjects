package week1.class1;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orginal = 153;
		int temp = orginal;
		int calculated = 0;

		while (orginal > 0) {
			int reminder = orginal % 10;
			int quotient = orginal / 10;
			calculated = calculated + (reminder * reminder * reminder);
			orginal = quotient;

		}
		if (temp == calculated) {
			System.out.println("Given number is AmstrongNumber");
		}
	}

}
