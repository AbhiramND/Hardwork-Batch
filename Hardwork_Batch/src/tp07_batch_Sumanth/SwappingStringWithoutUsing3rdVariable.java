package tp07_batch_Sumanth;

public class SwappingStringWithoutUsing3rdVariable {
public static void main(String[] args) {
	String s1 = "Tek";
	String s2 = "Pyramid";
	System.out.println("before swapping");
	System.out.println(s1);
	System.out.println(s2);
	
	s1=s1+s2;
	System.out.println(s1.length()+" "+s2.length());
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	
	System.out.println("After swapping");
	System.out.println(s1);
	System.out.println(s2);
}
}
