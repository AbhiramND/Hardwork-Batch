package tp07_batch_Sumanth;

public class ReverseWords {
public static void main(String[] args) {
	String s= "my name is king";
	String[] str = s.split(" ");
	for (String string : str) {
		StringBuilder builder=new StringBuilder(string);
		builder.reverse().append(" ");
		System.out.print(builder);
	}
}
}
