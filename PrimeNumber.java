package week1.class1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		boolean b = true;
		for (int i=2;i<a;i++) {
			if(a%i==0){
			b = false;
			break;
		}
   
	}
		if (b) {
			System.out.println("primeNumber");
		}
		else {
			System.out.println("Not PrimeNumber");
		}
	}
}
