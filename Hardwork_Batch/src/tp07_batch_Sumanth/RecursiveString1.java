package tp07_batch_Sumanth;

public class RecursiveString1 {
/*
 * string s="india"
 * rev(india)
 * 
 * length>0  a
 * rev(indi)
 * 
 * length>0  ai
 * rev(ind)
 * 
 * length>0  aid
 * rev(in)
 * 
 * length>0  aidn
 * rev(i)
 * 
 * length>0  aidni
 * rev("")
 */
	public static void main(String[] args) {
		reverse("enri media");
	}

	public static void reverse(String s) {
		if (s.length() > 0) {
			System.out.print(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));
		}
	}
}
