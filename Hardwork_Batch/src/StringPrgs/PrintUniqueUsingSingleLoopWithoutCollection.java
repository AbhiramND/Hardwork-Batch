package StringPrgs;

public class PrintUniqueUsingSingleLoopWithoutCollection {
/*
 * S a m S a m a n t h a
 * 0 1 2 3 4 5 6 7 8 9 10
 * i=0 ch=S index=0 lastIndex=3
 * i=1 ch=a index=1 lastIndex=10
 * i=2 ch=m index=2 lastIndex=5
 * i=3 ch=S index=0 lastIndex=3
 * i=4 ch=a index=1 lastIndex=10
 * i=5 ch=m index=2 lastIndex=5
 * i=6 ch=n index=7 lastIndex=7
 * i=7 ch=t index=8 lastIndex=8
 * i=8 ch=h index=9 lastIndex=9
 * i=9 ch=a index=1 lastIndex=10
 */
	public static void main(String[] args) {
		String s="SamSamantha";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
				 System.out.print(ch);
			}
		}
	}
}
