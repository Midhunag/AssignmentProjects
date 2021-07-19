package week1.class1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1= "stops";
		String text2 = "potss";
		if(text1.length() == text2.length())
		{
			char[] a = text1.toCharArray();
			char[] b = text2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			Boolean result = Arrays.equals(a,b); //compares the sorted array
			//Boolean res = a.equals(b);
			System.out.println(result);
			if(result == true) {
				System.out.println("Given word is Anagram");
			}
			else {
				System.out.println("Given word is not anagram");
			}
		}
	}

}
