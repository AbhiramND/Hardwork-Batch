package StringPrgs;

public class AddNumbersInString2 {
public static void main(String[] args) {
	String s="12345abcd12345";
	int sum=0;
	for(char ch:s.toCharArray()) {
		if(Character.isDigit(ch)) {
			int c = Character.getNumericValue(ch);
			sum+=c;
		}
	}
	System.out.println(sum);
}
}
