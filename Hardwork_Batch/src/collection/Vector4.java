package collection;

import java.util.Vector;

public class Vector4 
{
	public static void main(String[] args) 
	{
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		Vector l2=new Vector();
		l2.add('a');
		l2.add('b');
		l2.add('c');
		l1.addAll(2,l2);
		System.out.println(l1);
		
		

	}


}
