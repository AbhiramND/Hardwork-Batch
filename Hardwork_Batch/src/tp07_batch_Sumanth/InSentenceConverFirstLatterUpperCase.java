package tp07_batch_Sumanth;

public class InSentenceConverFirstLatterUpperCase {

	public static void main(String[] args) {
		String s = "welcome to tp office";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}
		for (int i = 0; i < str.length; i++) {
			String s1 = str[i];
			char ch = s1.charAt(0);
			if (ch >= 'a' && ch <= 'z')
//				if(ch>=97&&ch<=122)
			{
				ch = (char) (ch - 32);
			}
			System.out.print(ch + s1.substring(1) + " ");
		}
	}

}
