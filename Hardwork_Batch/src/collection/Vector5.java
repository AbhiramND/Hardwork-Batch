package collection;

import java.util.Vector;

public class Vector5 
{
	public static void main(String[] args) 
	{
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		Vector l2=new Vector();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(100);
		l2.add(120);
		l1.removeAll(l2);
		System.out.println(l1);
		
		

	}

}
