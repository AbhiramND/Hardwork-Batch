package StringPrgs;

public class Fetch5Character {
	public static void main(String[] args) {
		String s="my name is raju i caome from yadagiri district to learn Manual tsting";
		String s1=s.replaceAll(" ", "");
		String rev="";
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			rev=rev+s1.charAt(i);
//		}
//		for(int i=0;i<=rev.length()-1;i=i+5)
//		{
//			if(i+5<rev.length())
//			{
//				System.out.print(rev.substring(i,i+5)+" ");
//			}
//			else {
//				System.out.println(rev.substring(i)+" ");
//			}
//		}
		int count=1;
		int index=s1.length()-1;
		for(int i=s.length()-1;i>=0;i--) {
			if(count<=5 && index>=0) {
				System.out.print(s1.charAt(index));
				index--;
				count++;
			}else {
				System.out.print(" ");
				count=1;
			}
		}
	}

}
