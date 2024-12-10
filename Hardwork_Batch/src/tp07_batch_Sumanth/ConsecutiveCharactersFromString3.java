package tp07_batch_Sumanth;

public class ConsecutiveCharactersFromString3 {

	public static void main(String[] args) {
		String s = "aaabbaabacc";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(s.charAt(i) + "" + count);
				count = 1;
			}
		}
		System.out.print(s.charAt(s.length() - 1) + "" + count);
	}
}
/*
 * String s = "aaabbaabacc";
 * count=1;
 * i = 0; i < s.length()-1
 * a==a>count ++->count=2 i++
 * i=1 i<s.length()-1
 *  a==a>count ++->count=3 i++
 *  i=2
 *   a==b> a3 count=1 ++->count=1 i++
 *   i=3
 *   b==b=>count++=>count=2 i++
 *   i=4 a3b2
 *   b==a=>b2count++=>count=1 i++
 *   i=5
 *   a!=b=>a3b2a2count++=>count=2 i++
 *   i=6
 *   b!=a=>a3b2a2count++=>count=1 i++
 */