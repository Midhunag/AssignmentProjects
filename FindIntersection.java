
package week1.class2;

public class FindIntersection {
	int[] i = { 5,15,18,7,4,6 };
	int[] j = { 5, 4, 3, 18, 15 };

	public void intersection() {
		// TODO Auto-generated method stub
		for (int a = 0; a < i.length; a++) {
			for (int b = 0; b < j.length; b++) {
				if (i[a] == j[b]) {
					System.out.println(i[a]);
				}
			}

		}
	}
 public int returnCheck() {
	// TODO Auto-generated method stub
	 return j[2];

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindIntersection Obj = new FindIntersection();
		Obj.intersection();
		System.out.println("*************");
        int k = Obj.returnCheck();
        System.out.println(k);
	}
}

