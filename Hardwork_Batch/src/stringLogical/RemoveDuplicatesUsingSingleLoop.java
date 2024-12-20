package stringLogical;

public class RemoveDuplicatesUsingSingleLoop {

	public static void main(String[] args) {
		String s = "Rajubhai";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(res.indexOf(ch)==-1) {
				res+=ch;
			}
		}
		System.out.println(res);
	}
}
