package StringPrgs;

public class PrintDuplicatesUsingSingleLoop {
/*
 * S u m a n t h a
 * 0 1 2 3 4 5 6 7
 * i=0 ch=S index=0 lastIndex=0
 * i=1 ch=u index=1 lastIndex=1
 * i=2 ch=m index=2 lastIndex=2
 * i=3 ch=a index=3 lastIndex=7
 * i=4 ch=n index=4 lastIndex=4
 * i=5 ch=t index=5 lastIndex=5
 * i=6 ch=h index=6 lastIndex=6
 * i=7 ch=a index=3 lastIndex=7
 */
	public static void main(String[] args) {
		String s="Varoonraj";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch) && i==s.indexOf(ch)) {
				 System.out.print(ch);
			}
		}
	}
}
