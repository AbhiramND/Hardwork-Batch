package stringLogical;

public class RemoveDuplicatesUsingSingleLoop {

	public static void main(String[] args) {
		String s = "Rajubhai";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if(res.indexOf(s.charAt(i))==-1) {
				res+=s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
