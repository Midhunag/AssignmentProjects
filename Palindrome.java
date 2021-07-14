package week1.class2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String inp1 = "MADAM";
String inp2 = "";
char[] a = inp1.toCharArray();
for (int i = a.length-1; i >= 0; i--) {
	 inp2 = inp2 + a[i];
	
}
//System.out.println(inp1);
//System.out.println(inp2);
 if (inp1.equals(inp2)) {
	 System.out.println("Given word is Palindrome");
	
}
 else {
	 System.out.println("Not a Palindrome");
 }

	}

}
