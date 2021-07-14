package week1.class2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] a = test.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			
			if(i%2 !=0){
				System.out.println("index: " + i + " value: " + a[i]);
			}
					
		}
		

	}

}
